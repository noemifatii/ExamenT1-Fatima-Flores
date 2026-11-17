package entidades;

public class Proyectos {

	private int id;
	 private String nombre;
	 private String descripcion;
	 private String fechaInicio;
	 private String fechaCulminacion;
	 private String asesorTecnico;
	 private String presupuesto;

	 public Proyectos() {
	        super();
}

	 public Proyectos(int id,String nombre, String descripcion, String fechaInicio, String fechaCulminacion,
			String asesorTecnico, String presupuesto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaCulminacion = fechaCulminacion;
		this.asesorTecnico = asesorTecnico;
		this.presupuesto = presupuesto;
	 }
	 
	 public int getId() {
		    return id;
		}

		public void setId(int id) {
		    this.id = id;
		}

	 public String getNombre() {
		 return nombre;
	 }

	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }

	 public String getDescripcion() {
		 return descripcion;
	 }

	 public void setDescripcion(String descripcion) {
		 this.descripcion = descripcion;
	 }

	 public String getFechaInicio() {
		 return fechaInicio;
	 }

	 public void setFechaInicio(String fechaInicio) {
		 this.fechaInicio = fechaInicio;
	 }

	 public String getFechaCulminacion() {
		 return fechaCulminacion;
	 }

	 public void setFechaCulminacion(String fechaCulminacion) {
		 this.fechaCulminacion = fechaCulminacion;
	 }

	 public String getAsesorTecnico() {
		 return asesorTecnico;
	 }

	 public void setAsesorTecnico(String asesorTecnico) {
		 this.asesorTecnico = asesorTecnico;
	 }

	 public String getPresupuesto() {
		 return presupuesto;
	 }

	 public void setPresupuesto(String presupuesto) {
		 this.presupuesto = presupuesto;
	 }
	 
	 
}