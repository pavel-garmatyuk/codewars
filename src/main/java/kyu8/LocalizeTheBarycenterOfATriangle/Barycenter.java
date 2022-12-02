package kyu8.LocalizeTheBarycenterOfATriangle;

public class Barycenter {

    public static double[] barTriang(double[] x, double[] y, double[] z) {

        double[] centroid = new double[2]; // выделяю 2 ячейки под х и у
        // по формуле Хо и Уо = А + В + С / 3 складываю и делю полученные элементы и округляю их
        double xO = (x[0] + y[0] + z[0]) / 3;
        double yO = (x[1] + y[1] + z[1]) / 3;
        centroid[0] = Math.round(xO * 10000d) / 10000d;
        centroid[1] = Math.round(yO * 10000d) / 10000d;

        return centroid;
    }

    public static void main(String[] args) {
        //barTriang(new double[]{4,6}, new double[]{12,4}, new double[]{10,10});
        barTriang(new double[]{4,2}, new double[]{12,2}, new double[]{6,10});

    }
}
