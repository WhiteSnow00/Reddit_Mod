// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.BaseBundle;
import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import org.json.JSONObject;
import org.json.JSONException;
import org.json.JSONArray;
import lw0.b;
import android.os.Bundle;

public final class n3
{
    public final String a;
    public final Bundle b;
    public Bundle c;
    public final /* synthetic */ r3 d;
    
    public n3(final r3 d) {
        this.d = d;
        lw0.b.O("default_event_parameters");
        this.a = "default_event_parameters";
        this.b = new Bundle();
    }
    
    public final Bundle a() {
        if (this.c == null) {
            final String string = this.d.Q().getString(this.a, (String)null);
            if (string != null) {
                try {
                    final Bundle c = new Bundle();
                    final JSONArray jsonArray = new JSONArray(string);
                    for (int i = 0; i < jsonArray.length(); ++i) {
                        try {
                            final JSONObject jsonObject = jsonArray.getJSONObject(i);
                            final String string2 = jsonObject.getString("n");
                            final String string3 = jsonObject.getString("t");
                            final int hashCode = string3.hashCode();
                            int n = 0;
                            Label_0168: {
                                if (hashCode != 100) {
                                    if (hashCode != 108) {
                                        if (hashCode == 115) {
                                            if (string3.equals("s")) {
                                                n = 0;
                                                break Label_0168;
                                            }
                                        }
                                    }
                                    else if (string3.equals("l")) {
                                        n = 2;
                                        break Label_0168;
                                    }
                                }
                                else if (string3.equals("d")) {
                                    n = 1;
                                    break Label_0168;
                                }
                                n = -1;
                            }
                            if (n != 0) {
                                if (n != 1) {
                                    if (n != 2) {
                                        ((h4)this.d.f).h().k.b((Object)string3, "Unrecognized persisted bundle type. Type");
                                    }
                                    else {
                                        ((BaseBundle)c).putLong(string2, Long.parseLong(jsonObject.getString("v")));
                                    }
                                }
                                else {
                                    ((BaseBundle)c).putDouble(string2, Double.parseDouble(jsonObject.getString("v")));
                                }
                            }
                            else {
                                ((BaseBundle)c).putString(string2, jsonObject.getString("v"));
                            }
                        }
                        catch (final JSONException | NumberFormatException ex) {
                            ((h4)this.d.f).h().k.a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.c = c;
                }
                catch (final JSONException ex2) {
                    ((h4)this.d.f).h().k.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.c == null) {
                this.c = this.b;
            }
        }
        return this.c;
    }
    
    public final void b(Bundle bundle) {
        Bundle c = bundle;
        if (bundle == null) {
            c = new Bundle();
        }
        final SharedPreferences$Editor edit = this.d.Q().edit();
        if (((BaseBundle)c).size() == 0) {
            edit.remove(this.a);
        }
        else {
            final String a = this.a;
            bundle = (Bundle)new JSONArray();
            for (final String s : ((BaseBundle)c).keySet()) {
                final Object value = ((BaseBundle)c).get(s);
                if (value != null) {
                    try {
                        final JSONObject jsonObject = new JSONObject();
                        jsonObject.put("n", (Object)s);
                        jsonObject.put("v", (Object)value.toString());
                        if (value instanceof String) {
                            jsonObject.put("t", (Object)"s");
                        }
                        else if (value instanceof Long) {
                            jsonObject.put("t", (Object)"l");
                        }
                        else {
                            if (!(value instanceof Double)) {
                                ((h4)this.d.f).h().k.b((Object)value.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                                continue;
                            }
                            jsonObject.put("t", (Object)"d");
                        }
                        ((JSONArray)bundle).put((Object)jsonObject);
                    }
                    catch (final JSONException ex) {
                        ((h4)this.d.f).h().k.b((Object)ex, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(a, ((JSONArray)bundle).toString());
        }
        edit.apply();
        this.c = c;
    }
}
