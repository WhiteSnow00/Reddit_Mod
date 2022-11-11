// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import com.google.android.gms.internal.firebase_auth_api.g;

public abstract class d2
{
    public static boolean a(int i, final int n, final byte[] array) {
        int n2;
        for (n2 = i; n2 < n && array[n2] >= 0; ++n2) {}
        if ((i = n2) < n) {
            while (i < n) {
                final int n3 = i + 1;
                final int n4 = array[i];
                i = n3;
                if (n4 < 0) {
                    if (n4 < -32) {
                        i = n4;
                        if (n3 >= n) {
                            return i == 0;
                        }
                        if (n4 >= -62) {
                            i = n3 + 1;
                            if (array[n3] <= -65) {
                                continue;
                            }
                        }
                    }
                    else if (n4 < -16) {
                        if (n3 >= n - 1) {
                            i = g.a(n3, n, array);
                            return i == 0;
                        }
                        final int n5 = n3 + 1;
                        i = array[n3];
                        if (i <= -65 && (n4 != -32 || i >= -96) && (n4 != -19 || i < -96)) {
                            i = n5 + 1;
                            if (array[n5] <= -65) {
                                continue;
                            }
                        }
                    }
                    else {
                        if (n3 >= n - 2) {
                            i = g.a(n3, n, array);
                            return i == 0;
                        }
                        i = n3 + 1;
                        final byte b = array[n3];
                        if (b <= -65 && b + 112 + (n4 << 28) >> 30 == 0) {
                            final int n6 = i + 1;
                            if (array[i] <= -65) {
                                i = n6 + 1;
                                if (array[n6] <= -65) {
                                    continue;
                                }
                            }
                        }
                    }
                    i = -1;
                    return i == 0;
                }
            }
        }
        i = 0;
        return i == 0;
    }
}
