// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Path$FillType;
import android.util.JsonReader;
import com.bytedance.covode.number.Covode;

public final class 0KS
{
    static {
        Covode.recordClassIndex(2366);
    }
    
    public static 1Bd LIZ(final JsonReader jsonReader, final 0Kp 0Kp) {
        String nextString = null;
        1hC liz;
        1BV<Integer, Integer> lizlll = liz = null;
        int nextInt = 1;
        boolean nextBoolean = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "fillEnabled": {
                    nextBoolean = jsonReader.nextBoolean();
                    continue;
                }
                case "c": {
                    lizlll = 0KZ.LIZLLL(jsonReader, 0Kp);
                    continue;
                }
                case "o": {
                    liz = 0KZ.LIZ(jsonReader, 0Kp);
                    continue;
                }
                case "r": {
                    nextInt = jsonReader.nextInt();
                    continue;
                }
                case "nm": {
                    nextString = jsonReader.nextString();
                    continue;
                }
                default:
                    break;
            }
            jsonReader.skipValue();
        }
        Path$FillType path$FillType;
        if (nextInt == 1) {
            path$FillType = Path$FillType.WINDING;
        }
        else {
            path$FillType = Path$FillType.EVEN_ODD;
        }
        return new 1Bd(nextString, nextBoolean, path$FillType, (1h9)lizlll, liz);
    }
}
