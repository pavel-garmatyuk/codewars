package kyu8.WellOfIdeasEasyVersion;

/**
 * For every good kata idea there seem to be quite a few bad ones!
 * <p>
 * In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'.
 * <p>
 * If there are one or two good ideas, return 'Publish!',
 * <p>
 * if there are more than 2 return 'I smell a series!'.
 * <p>
 * If there are no good ideas, as is often the case, return 'Fail!'.
 */

public class Kata {

    public static String well(String[] x) {
        // TODO
        int count = 0;
        for (String s : x) {
            if (s.equals("good")) {
                count++;
            }
            if (count > 2) {
                return "I smell a series!";
            }
        }
        if (count != 0) {
            return "Publish!";
        }
        return "Fail!";
    }
}
