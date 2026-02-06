public class GradeService {

    public double calcularPromedio(double a, double b, double c) {
        double promedioParcial;
        promedioParcial = (a + b + c) / 3;
        return promedioParcial;
    }

    public double calcularFinal(double promedioParcial, int asistencia) {
        double promedioFinal;

        promedioFinal = (promedioParcial * 0.7) + (asistencia * 0.3);
        return promedioFinal;
    }

    public String determinarEstado(double promedioFinal, int asistencia, boolean entregoProyecto) {

        if (asistencia < 80) {
            return "Reprobado por asistencia";
        }
        if (!entregoProyecto) {
            return "Reprobado por proyecto";
        }
        if (promedioFinal < 70) {
            return "Reprobado por promedio";
        }
        return "Aprobado";
    }
}
