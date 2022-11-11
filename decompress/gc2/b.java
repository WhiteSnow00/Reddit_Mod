// 
// Decompiled by Procyon v0.6.0
// 

package gc2;

public final class b
{
    public static final int a;
    
    static {
        final String property = System.getProperty("java.version");
        final int n = 0;
        int n3;
        try {
            final String[] split = property.split("[._]");
            final int n2 = n3 = Integer.parseInt(split[0]);
            if (n2 == 1) {
                n3 = n2;
                if (split.length > 1) {
                    n3 = Integer.parseInt(split[1]);
                }
            }
        }
        catch (final NumberFormatException ex) {
            n3 = -1;
        }
        int int1;
        if ((int1 = n3) == -1) {
            try {
                final StringBuilder sb = new StringBuilder();
                for (int i = n; i < property.length(); ++i) {
                    final char char1 = property.charAt(i);
                    if (!Character.isDigit(char1)) {
                        break;
                    }
                    sb.append(char1);
                }
                int1 = Integer.parseInt(sb.toString());
            }
            catch (final NumberFormatException ex2) {
                int1 = -1;
            }
        }
        int a2;
        if ((a2 = int1) == -1) {
            a2 = 6;
        }
        a = a2;
    }
}
