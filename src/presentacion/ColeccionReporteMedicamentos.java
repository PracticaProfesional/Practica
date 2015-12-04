// @author QUINCHO
 
package presentacion;

import negocio.NegocioReporteMedicamentosBean;
import negocio.NegocioInventario;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;

public class ColeccionReporteMedicamentos 
{
    private /*static*/ List<ReporteMedicamentosBean>  listaDeMedicamentos = new ArrayList<>(); //  Aqui se guradaran todas los objetos de el reporte
    private  String nombre;
    private  int totalAdministrativos;
    private  int totalEstudiantes;
    private  int totalDocentes;
    
    
    public  void llenarColeccion(String fechaDesde, String fechaHasta)
    {
        ReporteMedicamentosBean objReporteMedicamentosBean;
        NegocioReporteMedicamentosBean objNegocioReporteMedicamentosBean = new NegocioReporteMedicamentosBean();
        NegocioInventario objeNegocioInventario = new NegocioInventario();
        
        ResultSet rs1, rs2;
        
        try
        {
            rs1 = objNegocioReporteMedicamentosBean.obtenerDatosConsultaInventario(fechaDesde, fechaHasta);
            rs2 = objeNegocioInventario.listarMedicamentosInventario();
            
            String nombreMedicamento;
            
            while(rs2.next())
            {
                objReporteMedicamentosBean = new ReporteMedicamentosBean();
                
                nombreMedicamento = rs2.getString("nombre");
                
                while(rs1.next())
                {
                    if(nombreMedicamento.equals(rs1.getString("nombre")))
                    {
                        switch(rs1.getInt("tipo"))
                        {
                            case 1:
                                totalAdministrativos += rs1.getInt("cantidad");
                                break;
                                
                            case 2:
                                totalEstudiantes += rs1.getInt("cantidad");
                                break;
                                
                            case 3:
                                totalDocentes += rs1.getInt("cantidad");
                                break;
                        }// fin del switch
                        
                        //System.out.println("Medicamento: " + nombreMedicamento);
                    }// fin del if
                }// fin del while
                
                /*System.out.println("Medicamento: " + nombreMedicamento + "\ttotal administrativos" + totalAdministrativos + "\ttotal estudiantes" +
                        totalEstudiantes + "\ttotal docentes" + totalDocentes);*/
                rs1.beforeFirst();
                
                /*objReporteMedicamentosBean.setNombreMedicamento(nombreMedicamento);
                objReporteMedicamentosBean.setTotalAdministrativos(totalAdministrativos);
                objReporteMedicamentosBean.setTotalEstudiantes(totalEstudiantes);
                objReporteMedicamentosBean.setTotalDocentes(totalDocentes);
                objReporteMedicamentosBean.setTotal(totalAdministrativos + totalEstudiantes + totalDocentes);*/
                
                listaDeMedicamentos.add( new ReporteMedicamentosBean (nombreMedicamento, totalAdministrativos,
                        totalEstudiantes, totalDocentes, (totalAdministrativos + totalEstudiantes + totalDocentes) ));
                
                totalAdministrativos = 0;
                totalEstudiantes = 0;
                totalDocentes = 0;
            }// fin del while
        }// fin del try
        catch(SQLException sqle)
        {
            System.out.println(sqle.getErrorCode() + sqle.getMessage());
        }// fin del catch
        
    }// fin del metodo llenarColeccion
    
    /*public static List<ReporteMedicamentosBean> cargarMedicamentosALaColeccion()
    {
        llenarColeccion();
        return listaDeMedicamentos;
    }// fin del metodo cargarMedicamentosALaColeccion*/
    
    public void imprimirLista()
    {
        Iterator iter = listaDeMedicamentos.iterator();
        
        while (iter.hasNext())
        {
            ReporteMedicamentosBean producto = (ReporteMedicamentosBean)iter.next(); 
            System.out.println("Medicamento: " + producto.getNombreMedicamento() + 
                    "\tTotal administrativos: " + producto.getTotalAdministrativos() + 
                    "\ttTotal estudiante: " + producto.getTotalEstudiantes() + 
                    "\tTotal docentes: " + producto.getTotalDocentes()); 

        }// fin del while
    }// fin del metodo imprimirLista
    
    //El siguiente metodo oredena la lista en orden alfabetico por el nombre de medicamento
    @SuppressWarnings("Convert2Lambda")
    public void ordenarLista()
    {
        Collections.sort(listaDeMedicamentos, new Comparator<ReporteMedicamentosBean>()
            {
                @Override
                public int compare(ReporteMedicamentosBean t, ReporteMedicamentosBean t1) 
                {
                    return t.getNombreMedicamento().compareTo(t1.getNombreMedicamento());
                }// fin del metodo abstracto compare
            }// fin de la clase interna anonima
        );
    }// fin del metodo ordenarLista
    
    public List<ReporteMedicamentosBean> cargarMedicamentosALaColeccionNoStatic(String fechaDesde, String fechaHasta)
    {
        llenarColeccion(fechaDesde, fechaHasta);
        ordenarLista();
        return listaDeMedicamentos;
    }// fin del metodo cargarMedicamentosALaColeccion
}// fin de la clase ColeccionReporteMedicamentos
