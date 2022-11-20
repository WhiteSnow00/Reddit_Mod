// 
// Decompiled by Procyon v0.6.0
// 

package he;

import org.json.JSONException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class kd implements bc
{
    public String f;
    public String g;
    public String h;
    public final md i;
    public final md j;
    
    public kd() {
        this.i = new md();
        this.j = new md();
    }
    
    public final String zza() throws JSONException {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("returnSecureToken", true);
        final boolean empty = this.j.g.isEmpty();
        final int n = 0;
        if (!empty) {
            final List g = this.j.g;
            final JSONArray jsonArray = new JSONArray();
            for (int i = 0; i < g.size(); ++i) {
                jsonArray.put(g.get(i));
            }
            jsonObject.put("deleteProvider", (Object)jsonArray);
        }
        final List g2 = this.i.g;
        final int size = g2.size();
        final int[] array = new int[size];
        for (int j = 0; j < g2.size(); ++j) {
            final String s = g2.get(j);
            final int hashCode = s.hashCode();
            int n2 = 2;
            int n3 = 0;
            Label_0269: {
                switch (hashCode) {
                    case 1999612571: {
                        if (s.equals("PASSWORD")) {
                            n3 = 2;
                            break Label_0269;
                        }
                        break;
                    }
                    case 1939891618: {
                        if (s.equals("PHOTO_URL")) {
                            n3 = 3;
                            break Label_0269;
                        }
                        break;
                    }
                    case 66081660: {
                        if (s.equals("EMAIL")) {
                            n3 = 0;
                            break Label_0269;
                        }
                        break;
                    }
                    case -333046776: {
                        if (s.equals("DISPLAY_NAME")) {
                            n3 = 1;
                            break Label_0269;
                        }
                        break;
                    }
                }
                n3 = -1;
            }
            if (n3 != 0) {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            n2 = 0;
                        }
                        else {
                            n2 = 4;
                        }
                    }
                    else {
                        n2 = 5;
                    }
                }
            }
            else {
                n2 = 1;
            }
            array[j] = n2;
        }
        if (size > 0) {
            final JSONArray jsonArray2 = new JSONArray();
            for (int k = n; k < size; ++k) {
                jsonArray2.put(array[k]);
            }
            jsonObject.put("deleteAttribute", (Object)jsonArray2);
        }
        final String f = this.f;
        if (f != null) {
            jsonObject.put("idToken", (Object)f);
        }
        final String g3 = this.g;
        if (g3 != null) {
            jsonObject.put("email", (Object)g3);
        }
        final String h = this.h;
        if (h != null) {
            jsonObject.put("password", (Object)h);
        }
        return jsonObject.toString();
    }
}
