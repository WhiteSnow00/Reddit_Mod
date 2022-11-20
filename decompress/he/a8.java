// 
// Decompiled by Procyon v0.6.0
// 

package he;

public final class a8 extends q7
{
    @Override
    public final String toString() {
        final StringBuilder t = a.t("CharMatcher.is('");
        final char[] array2;
        final char[] array = array2 = new char[6];
        array2[0] = '\\';
        array2[1] = 'u';
        array2[3] = (array2[2] = '\0');
        array2[5] = (array2[4] = '\0');
        int n = 46;
        for (int i = 0; i < 4; ++i) {
            array[5 - i] = "0123456789ABCDEF".charAt(n & 0xF);
            n >>= 4;
        }
        t.append(String.copyValueOf(array));
        t.append("')");
        return t.toString();
    }
}
