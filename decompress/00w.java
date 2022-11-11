// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public enum 00w
{
    LEVEL_0, 
    LEVEL_1, 
    LEVEL_2, 
    LEVEL_3, 
    LEVEL_4, 
    LEVEL_5, 
    LEVEL_6, 
    LEVEL_7, 
    LEVEL_8, 
    LEVEL_9;
    
    static {
        Covode.recordClassIndex(85);
    }
    
    public static 00w valueOf(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 0: {
                return 00w.LEVEL_0;
            }
            case 1: {
                return 00w.LEVEL_1;
            }
            case 2: {
                return 00w.LEVEL_2;
            }
            case 3: {
                return 00w.LEVEL_3;
            }
            case 4: {
                return 00w.LEVEL_4;
            }
            case 5: {
                return 00w.LEVEL_5;
            }
            case 6: {
                return 00w.LEVEL_6;
            }
            case 7: {
                return 00w.LEVEL_7;
            }
            case 8: {
                return 00w.LEVEL_8;
            }
            case 9: {
                return 00w.LEVEL_9;
            }
        }
    }
}
