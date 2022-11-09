// 
// Decompiled by Procyon v0.6.0
// 

package nd;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.regex.Matcher;
import j0.i;
import android.os.Parcelable;
import android.util.Log;
import android.os.Messenger;
import android.content.Intent;
import android.os.Message;
import android.os.Looper;
import ge.b;

public final class e extends b
{
    public final /* synthetic */ c a;
    
    public e(final c a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(Message a) {
        final c a2 = this.a;
        if (a != null) {
            final Object obj = a.obj;
            if (obj instanceof Intent) {
                final Intent intent = (Intent)obj;
                intent.setExtrasClassLoader((ClassLoader)new g());
                if (intent.hasExtra("google.messenger")) {
                    final Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof h) {
                        a2.g = (h)parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        a2.f = (Messenger)parcelableExtra;
                    }
                }
                final Intent intent2 = (Intent)a.obj;
                final String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        final String value = String.valueOf(action);
                        String concat;
                        if (value.length() != 0) {
                            concat = "Unexpected response action: ".concat(value);
                        }
                        else {
                            concat = new String("Unexpected response action: ");
                        }
                        Log.d("Rpc", concat);
                    }
                    return;
                }
                else {
                    String s;
                    if ((s = intent2.getStringExtra("registration_id")) == null) {
                        s = intent2.getStringExtra("unregistered");
                    }
                    if (s == null) {
                        final String stringExtra = intent2.getStringExtra("error");
                        if (stringExtra == null) {
                            final String value2 = String.valueOf(intent2.getExtras());
                            final StringBuilder sb = new StringBuilder(value2.length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(value2);
                            Log.w("Rpc", sb.toString());
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            String concat2;
                            if (stringExtra.length() != 0) {
                                concat2 = "Received InstanceID error ".concat(stringExtra);
                            }
                            else {
                                concat2 = new String("Received InstanceID error ");
                            }
                            Log.d("Rpc", concat2);
                        }
                        if (stringExtra.startsWith("|")) {
                            final String[] split = stringExtra.split("\\|");
                            if (split.length > 2 && "ID".equals(split[1])) {
                                final String s2 = split[2];
                                String substring;
                                final String s3 = substring = split[3];
                                if (s3.startsWith(":")) {
                                    substring = s3.substring(1);
                                }
                                a2.c(intent2.putExtra("error", substring).getExtras(), s2);
                                return;
                            }
                            String concat3;
                            if (stringExtra.length() != 0) {
                                concat3 = "Unexpected structured response ".concat(stringExtra);
                            }
                            else {
                                concat3 = new String("Unexpected structured response ");
                            }
                            Log.w("Rpc", concat3);
                            return;
                        }
                        else {
                            a = (Message)a2.a;
                            monitorenter(a);
                            int n = 0;
                            try {
                                while (true) {
                                    final i a3 = a2.a;
                                    if (n >= a3.h) {
                                        break;
                                    }
                                    a2.c(intent2.getExtras(), (String)a3.j(n));
                                    ++n;
                                }
                                return;
                            }
                            finally {
                                monitorexit(a);
                            }
                        }
                    }
                    final Matcher matcher = c.j.matcher(s);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            String concat4;
                            if (s.length() != 0) {
                                concat4 = "Unexpected response string: ".concat(s);
                            }
                            else {
                                concat4 = new String("Unexpected response string: ");
                            }
                            Log.d("Rpc", concat4);
                        }
                        return;
                    }
                    else {
                        final String group = matcher.group(1);
                        final String group2 = matcher.group(2);
                        if (group != null) {
                            final Bundle extras = intent2.getExtras();
                            ((BaseBundle)extras).putString("registration_id", group2);
                            a2.c(extras, group);
                        }
                        return;
                    }
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
