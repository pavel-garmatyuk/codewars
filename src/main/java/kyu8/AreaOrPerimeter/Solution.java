package kyu8.AreaOrPerimeter;

/**
 * You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.
 * If it is a square, return its area. If it is a rectangle, return its perimeter.
 * <p>
 * area_or_perimeter(6, 10) --> 32
 * area_or_perimeter(3, 3) --> 9
 * Note: for the purposes of this kata you will assume that it is a square if its length and width are equal, otherwise it is a rectangle.
 */
public class Solution {
    public static int areaOrPerimeter(int l, int w) {
        // code away...
        if (l == w) {
            return area(l, w);
        } else {
            return perimeter(l, w);
        }
    }

    public static int area(int l, int w) {
        return l * w;
    }

    public static int perimeter(int l, int w) {
        return (l + w) * 2;
    }
}
