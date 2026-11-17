<%@page import="entidades.Proyectos"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Registrar Proyectos de Inversion Publica</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        body {
            background-color: #f5f6f7;
        }

        .card {
            border-radius: 10px;
        }
    </style>
</head>

<body>

<div class="container mt-5">
    <div class="row">

        
        <div class="col-md-4">

            <div class="card p-4 shadow-sm">

                <h4 class="mb-3">Registrar Proyectos de Inversion Publica</h4>

                <form method="post" action="ProyectosServlet">

                    <div class="mb-3">
                        <label class="form-label">Nombre del Proyecto</label>
                        <input name="nombre" type="text"
                               class="form-control"
                               minlength="4" maxlength="60" required>
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Descripción Técnica</label>
                        <textarea name="descripcion"
                                  class="form-control"></textarea>
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Fecha de Inicio</label>
                        <input name="fechaInicio" type="date"
                               class="form-control" required>
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Fecha de Culminación</label>
                        <input name="fechaCulminacion" type="date"
                               class="form-control" required>
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Asesor Técnico</label>
                        <input name="asesorTecnico" type="text"
                               class="form-control" required>
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Presupuesto Asignado</label>
                        <input name="presupuesto" type="number"
                               class="form-control"
                               min="0" step="0.01" required>
                    </div>

                    <button type="submit" class="btn btn-primary">
                        Registrar
                    </button>

                    <a href="ProyectosServlet" class="btn btn-warning">
                        Listar
                    </a>

                </form>

            </div>
        </div>

        
        <div class="col-md-8">

            <div class="card p-4 shadow-sm">

                <h4 class="mb-3">Proyectos Registrados</h4>

                <div class="table-responsive">

                    <table class="table table-hover">

                        <thead class="table-light">
                            <tr>
                                <th>Id</th>
                                <th>Nombre</th>
                                <th>Descripción</th>
                                <th>Fecha Inicio</th>
                                <th>Fecha Culminación</th>
                                <th>Asesor Técnico</th>
                                <th>Presupuesto</th>
                            </tr>
                        </thead>

                        <tbody>

                        <%
                        List<Proyectos> lista =
                            (List<Proyectos>) request.getAttribute("proyectos");

                        if (lista != null && !lista.isEmpty()) {

                            for (Proyectos p : lista) {
                        %>

                            <tr>
                                <td><%= p.getId() %></td>
                                <td><%= p.getNombre() %></td>
                                <td><%= p.getDescripcion() %></td>
                                <td><%= p.getFechaInicio() %></td>
                                <td><%= p.getFechaCulminacion() %></td>
                                <td><%= p.getAsesorTecnico() %></td>
                                <td><%= p.getPresupuesto() %></td>
                            </tr>

                        <%
                            }
                        }
                        %>

                        </tbody>

                    </table>

                </div>

            </div>
        </div>

    </div>
</div>

</body>
</html>