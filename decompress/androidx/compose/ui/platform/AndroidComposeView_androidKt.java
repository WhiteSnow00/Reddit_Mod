// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import o2.t;
import o2.o;
import mg2.l;

public final class AndroidComposeView_androidKt
{
    public static l<? super o, ? extends t> a;
    
    static {
        AndroidComposeView_androidKt.a = (l<? super o, ? extends t>)AndroidComposeView_androidKt$textInputServiceFactory$1.INSTANCE;
    }
    
    public static final void a(final float[] array, final float[] array2) {
        final float b = b(0, array2, array, 0);
        final float b2 = b(0, array2, array, 1);
        final float b3 = b(0, array2, array, 2);
        final float b4 = b(0, array2, array, 3);
        final float b5 = b(1, array2, array, 0);
        final float b6 = b(1, array2, array, 1);
        final float b7 = b(1, array2, array, 2);
        final float b8 = b(1, array2, array, 3);
        final float b9 = b(2, array2, array, 0);
        final float b10 = b(2, array2, array, 1);
        final float b11 = b(2, array2, array, 2);
        final float b12 = b(2, array2, array, 3);
        final float b13 = b(3, array2, array, 0);
        final float b14 = b(3, array2, array, 1);
        final float b15 = b(3, array2, array, 2);
        final float b16 = b(3, array2, array, 3);
        array[0] = b;
        array[1] = b2;
        array[2] = b3;
        array[3] = b4;
        array[4] = b5;
        array[5] = b6;
        array[6] = b7;
        array[7] = b8;
        array[8] = b9;
        array[9] = b10;
        array[10] = b11;
        array[11] = b12;
        array[12] = b13;
        array[13] = b14;
        array[14] = b15;
        array[15] = b16;
    }
    
    public static final float b(int n, final float[] array, final float[] array2, final int n2) {
        n *= 4;
        return array[n + 3] * array2[12 + n2] + (array[n + 2] * array2[8 + n2] + (array[n + 1] * array2[4 + n2] + array[n + 0] * array2[0 + n2]));
    }
}
