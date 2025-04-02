package cw.empleados.servicio;

import cw.empleados.modelo.Empleado;
import java.util.List;

public interface IEmpleadoServicio {
     public List<Empleado> listarEmpleados();

     public Empleado buscarEmpleadoPorId(Integer idEmpleado);

     public void guardarEmpleado(Empleado empleado);

     public void eliminarEmpleado(Empleado empleado);
}
