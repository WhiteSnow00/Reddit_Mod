// 
// Decompiled by Procyon v0.6.0
// 

package h60;

import android.database.Cursor;
import java.util.ArrayList;
import l5.b;
import l5.c;
import com.reddit.data.room.dao.f;
import j5.o;
import k60.a;
import java.util.List;
import java.util.concurrent.Callable;

public final class r1 implements Callable<List<a>>
{
    public final /* synthetic */ o f;
    public final /* synthetic */ f g;
    
    public r1(final f g, final o f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final Object call() throws Exception {
        final Cursor b = c.b(this.g.f, this.f, false);
        try {
            final int b2 = l5.b.b(b, "id");
            final int b3 = l5.b.b(b, "name");
            final int b4 = l5.b.b(b, "prefixedName");
            final int b5 = l5.b.b(b, "avatarImageUrl");
            final int b6 = l5.b.b(b, "rank");
            final int b7 = l5.b.b(b, "rankDelta");
            final int b8 = l5.b.b(b, "isSubscribed");
            final int b9 = l5.b.b(b, "backgroundColorKey");
            final int b10 = l5.b.b(b, "backgroundColor");
            final int b11 = l5.b.b(b, "subscribers");
            final int b12 = l5.b.b(b, "isNsfw");
            final int b13 = l5.b.b(b, "isQuarantined");
            final int b14 = l5.b.b(b, "categoryId");
            final int b15 = l5.b.b(b, "publicDescription");
            try {
                final int b16 = l5.b.b(b, "cursor");
                final int b17 = l5.b.b(b, "timestamp");
                final ArrayList list = new ArrayList<a>(b.getCount());
                while (b.moveToNext()) {
                    final boolean null = b.isNull(b2);
                    String string = null;
                    String string2;
                    if (null) {
                        string2 = null;
                    }
                    else {
                        string2 = b.getString(b2);
                    }
                    String string3;
                    if (b.isNull(b3)) {
                        string3 = null;
                    }
                    else {
                        string3 = b.getString(b3);
                    }
                    String string4;
                    if (b.isNull(b4)) {
                        string4 = null;
                    }
                    else {
                        string4 = b.getString(b4);
                    }
                    String string5;
                    if (b.isNull(b5)) {
                        string5 = null;
                    }
                    else {
                        string5 = b.getString(b5);
                    }
                    Integer value;
                    if (b.isNull(b6)) {
                        value = null;
                    }
                    else {
                        value = b.getInt(b6);
                    }
                    Integer value2;
                    if (b.isNull(b7)) {
                        value2 = null;
                    }
                    else {
                        value2 = b.getInt(b7);
                    }
                    final boolean b18 = b.getInt(b8) != 0;
                    String string6;
                    if (b.isNull(b9)) {
                        string6 = null;
                    }
                    else {
                        string6 = b.getString(b9);
                    }
                    Integer value3;
                    if (b.isNull(b10)) {
                        value3 = null;
                    }
                    else {
                        value3 = b.getInt(b10);
                    }
                    final long long1 = b.getLong(b11);
                    final boolean b19 = b.getInt(b12) != 0;
                    final boolean b20 = b.getInt(b13) != 0;
                    String string7;
                    if (b.isNull(b14)) {
                        string7 = null;
                    }
                    else {
                        string7 = b.getString(b14);
                    }
                    String string8;
                    if (b.isNull(b15)) {
                        string8 = null;
                    }
                    else {
                        string8 = b.getString(b15);
                    }
                    if (!b.isNull(b16)) {
                        string = b.getString(b16);
                    }
                    list.add(new a(string2, string3, string4, string5, value, value2, b18, string6, value3, long1, b19, b20, string7, string8, string, b.getLong(b17)));
                }
                b.close();
                this.f.h();
                return list;
            }
            finally {}
        }
        finally {}
        b.close();
        this.f.h();
    }
}
