// 
// Decompiled by Procyon v0.6.0
// 

package h60;

import io.reactivex.plugins.RxJavaPlugins;
import xf2.f;
import java.util.concurrent.Callable;
import nf2.a;
import java.util.Iterator;
import a4.u1;
import java.util.ArrayList;
import java.util.List;
import android.database.Cursor;
import l5.b;
import l5.c;
import j5.o;
import kotlin.Pair;
import j5.w;
import j5.d;
import i60.k;
import j5.e;
import androidx.room.RoomDatabase;

public final class d0 implements c0
{
    public final RoomDatabase f;
    public final d0$a g;
    public final d0$e h;
    public final d0$f i;
    public final d0$g j;
    
    public d0(final RoomDatabase f) {
        this.f = f;
        this.g = new e<k>(f) {
            public final String b() {
                return "INSERT OR ABORT INTO `link_mutations` (`parentLinkId`,`isRead`,`readTimestampUtc`,`isHidden`,`isSubscribed`,`isSaved`,`isFollowed`) VALUES (?,?,?,?,?,?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final k k = (k)o;
                final String a = k.a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
                e.bindLong(2, k.b ? 1 : 0);
                e.bindLong(3, k.c);
                final Boolean d = k.d;
                final Integer n = null;
                Integer value;
                if (d == null) {
                    value = null;
                }
                else {
                    value = (((boolean)d) ? 1 : 0);
                }
                if (value == null) {
                    e.bindNull(4);
                }
                else {
                    e.bindLong(4, value);
                }
                final Boolean e2 = k.e;
                Integer value2;
                if (e2 == null) {
                    value2 = null;
                }
                else {
                    value2 = (((boolean)e2) ? 1 : 0);
                }
                if (value2 == null) {
                    e.bindNull(5);
                }
                else {
                    e.bindLong(5, value2);
                }
                final Boolean f = k.f;
                Integer value3;
                if (f == null) {
                    value3 = null;
                }
                else {
                    value3 = (((boolean)f) ? 1 : 0);
                }
                if (value3 == null) {
                    e.bindNull(6);
                }
                else {
                    e.bindLong(6, value3);
                }
                final Boolean g = k.g;
                Integer value4;
                if (g == null) {
                    value4 = n;
                }
                else {
                    value4 = (((boolean)g) ? 1 : 0);
                }
                if (value4 == null) {
                    e.bindNull(7);
                }
                else {
                    e.bindLong(7, value4);
                }
            }
        };
        new e<k>(f) {
            public final String b() {
                return "INSERT OR REPLACE INTO `link_mutations` (`parentLinkId`,`isRead`,`readTimestampUtc`,`isHidden`,`isSubscribed`,`isSaved`,`isFollowed`) VALUES (?,?,?,?,?,?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final k k = (k)o;
                final String a = k.a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
                e.bindLong(2, k.b ? 1 : 0);
                e.bindLong(3, k.c);
                final Boolean d = k.d;
                final Integer n = null;
                Integer value;
                if (d == null) {
                    value = null;
                }
                else {
                    value = (((boolean)d) ? 1 : 0);
                }
                if (value == null) {
                    e.bindNull(4);
                }
                else {
                    e.bindLong(4, value);
                }
                final Boolean e2 = k.e;
                Integer value2;
                if (e2 == null) {
                    value2 = null;
                }
                else {
                    value2 = (((boolean)e2) ? 1 : 0);
                }
                if (value2 == null) {
                    e.bindNull(5);
                }
                else {
                    e.bindLong(5, value2);
                }
                final Boolean f = k.f;
                Integer value3;
                if (f == null) {
                    value3 = null;
                }
                else {
                    value3 = (((boolean)f) ? 1 : 0);
                }
                if (value3 == null) {
                    e.bindNull(6);
                }
                else {
                    e.bindLong(6, value3);
                }
                final Boolean g = k.g;
                Integer value4;
                if (g == null) {
                    value4 = n;
                }
                else {
                    value4 = (((boolean)g) ? 1 : 0);
                }
                if (value4 == null) {
                    e.bindNull(7);
                }
                else {
                    e.bindLong(7, value4);
                }
            }
        };
        new e<k>(f) {
            public final String b() {
                return "INSERT OR IGNORE INTO `link_mutations` (`parentLinkId`,`isRead`,`readTimestampUtc`,`isHidden`,`isSubscribed`,`isSaved`,`isFollowed`) VALUES (?,?,?,?,?,?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final k k = (k)o;
                final String a = k.a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
                e.bindLong(2, k.b ? 1 : 0);
                e.bindLong(3, k.c);
                final Boolean d = k.d;
                final Integer n = null;
                Integer value;
                if (d == null) {
                    value = null;
                }
                else {
                    value = (((boolean)d) ? 1 : 0);
                }
                if (value == null) {
                    e.bindNull(4);
                }
                else {
                    e.bindLong(4, value);
                }
                final Boolean e2 = k.e;
                Integer value2;
                if (e2 == null) {
                    value2 = null;
                }
                else {
                    value2 = (((boolean)e2) ? 1 : 0);
                }
                if (value2 == null) {
                    e.bindNull(5);
                }
                else {
                    e.bindLong(5, value2);
                }
                final Boolean f = k.f;
                Integer value3;
                if (f == null) {
                    value3 = null;
                }
                else {
                    value3 = (((boolean)f) ? 1 : 0);
                }
                if (value3 == null) {
                    e.bindNull(6);
                }
                else {
                    e.bindLong(6, value3);
                }
                final Boolean g = k.g;
                Integer value4;
                if (g == null) {
                    value4 = n;
                }
                else {
                    value4 = (((boolean)g) ? 1 : 0);
                }
                if (value4 == null) {
                    e.bindNull(7);
                }
                else {
                    e.bindLong(7, value4);
                }
            }
        };
        new d<k>(f) {
            public final String b() {
                return "DELETE FROM `link_mutations` WHERE `parentLinkId` = ?";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final String a = ((k)o).a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
            }
        };
        this.h = new d<k>(f) {
            public final String b() {
                return "UPDATE OR ABORT `link_mutations` SET `parentLinkId` = ?,`isRead` = ?,`readTimestampUtc` = ?,`isHidden` = ?,`isSubscribed` = ?,`isSaved` = ?,`isFollowed` = ? WHERE `parentLinkId` = ?";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final k k = (k)o;
                final String a = k.a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
                e.bindLong(2, k.b ? 1 : 0);
                e.bindLong(3, k.c);
                final Boolean d = k.d;
                final Integer n = null;
                Integer value;
                if (d == null) {
                    value = null;
                }
                else {
                    value = (((boolean)d) ? 1 : 0);
                }
                if (value == null) {
                    e.bindNull(4);
                }
                else {
                    e.bindLong(4, value);
                }
                final Boolean e2 = k.e;
                Integer value2;
                if (e2 == null) {
                    value2 = null;
                }
                else {
                    value2 = (((boolean)e2) ? 1 : 0);
                }
                if (value2 == null) {
                    e.bindNull(5);
                }
                else {
                    e.bindLong(5, value2);
                }
                final Boolean f = k.f;
                Integer value3;
                if (f == null) {
                    value3 = null;
                }
                else {
                    value3 = (((boolean)f) ? 1 : 0);
                }
                if (value3 == null) {
                    e.bindNull(6);
                }
                else {
                    e.bindLong(6, value3);
                }
                final Boolean g = k.g;
                Integer value4;
                if (g == null) {
                    value4 = n;
                }
                else {
                    value4 = (((boolean)g) ? 1 : 0);
                }
                if (value4 == null) {
                    e.bindNull(7);
                }
                else {
                    e.bindLong(7, value4);
                }
                final String a2 = k.a;
                if (a2 == null) {
                    e.bindNull(8);
                }
                else {
                    e.bindString(8, a2);
                }
            }
        };
        this.i = new w(f) {
            public final String b() {
                return "\n      UPDATE link_mutations\n      SET isRead = 0\n      WHERE isRead = 1\n    ";
            }
        };
        this.j = new w(f) {
            public final String b() {
                return "\n      DELETE FROM link_mutations\n      WHERE parentLinkId NOT IN(\n      SELECT parentLinkId FROM link_mutations ORDER BY readTimestampUtc DESC LIMIT ?\n      )\n    ";
            }
        };
    }
    
    @Override
    public final void J(final String s, final boolean b) {
        this.f.c();
        try {
            final Pair<k, Boolean> l1 = this.l1(s);
            this.U1(k.a((k)l1.component1(), false, 0L, b, null, null, null, 119), (boolean)l1.component2());
            this.f.q();
        }
        finally {
            this.f.m();
        }
    }
    
    @Override
    public final void L(final String s) {
        this.f.c();
        try {
            final Pair<k, Boolean> l1 = this.l1(s);
            this.U1(k.a((k)l1.component1(), true, System.currentTimeMillis(), null, null, null, null, 121), (boolean)l1.component2());
            this.f.q();
        }
        finally {
            this.f.m();
        }
    }
    
    public final void N(final Object[] array) {
        final k[] array2 = (k[])array;
        this.f.b();
        this.f.c();
        try {
            this.g.g(array2);
            this.f.q();
        }
        finally {
            this.f.m();
        }
    }
    
    @Override
    public final void N1(final String s, final boolean b) {
        this.f.c();
        try {
            final Pair<k, Boolean> l1 = this.l1(s);
            this.U1(k.a((k)l1.component1(), false, 0L, null, b, null, null, 111), (boolean)l1.component2());
            this.f.q();
        }
        finally {
            this.f.m();
        }
    }
    
    public final k S(String string) {
        final boolean b = true;
        final o a = o.a(1, "SELECT * FROM link_mutations WHERE parentLinkId = ?");
        a.bindString(1, string);
        this.f.b();
        final RoomDatabase f = this.f;
        k k = null;
        final Boolean b2 = null;
        final Cursor b3 = c.b(f, a, false);
        try {
            final int b4 = l5.b.b(b3, "parentLinkId");
            final int b5 = l5.b.b(b3, "isRead");
            final int b6 = l5.b.b(b3, "readTimestampUtc");
            final int b7 = l5.b.b(b3, "isHidden");
            final int b8 = l5.b.b(b3, "isSubscribed");
            final int b9 = l5.b.b(b3, "isSaved");
            final int b10 = l5.b.b(b3, "isFollowed");
            if (b3.moveToFirst()) {
                if (b3.isNull(b4)) {
                    string = null;
                }
                else {
                    string = b3.getString(b4);
                }
                final boolean b11 = b3.getInt(b5) != 0;
                final long long1 = b3.getLong(b6);
                Integer value;
                if (b3.isNull(b7)) {
                    value = null;
                }
                else {
                    value = b3.getInt(b7);
                }
                Boolean value2;
                if (value == null) {
                    value2 = null;
                }
                else {
                    value2 = (value != 0);
                }
                Integer value3;
                if (b3.isNull(b8)) {
                    value3 = null;
                }
                else {
                    value3 = b3.getInt(b8);
                }
                Boolean value4;
                if (value3 == null) {
                    value4 = null;
                }
                else {
                    value4 = (value3 != 0);
                }
                Integer value5;
                if (b3.isNull(b9)) {
                    value5 = null;
                }
                else {
                    value5 = b3.getInt(b9);
                }
                Boolean value6;
                if (value5 == null) {
                    value6 = null;
                }
                else {
                    value6 = (value5 != 0);
                }
                Integer value7;
                if (b3.isNull(b10)) {
                    value7 = null;
                }
                else {
                    value7 = b3.getInt(b10);
                }
                Boolean value8;
                if (value7 == null) {
                    value8 = b2;
                }
                else {
                    value8 = (value7 != 0 && b);
                }
                k = new k(string, b11, long1, value2, value4, value6, value8);
            }
            return k;
        }
        finally {
            b3.close();
            a.h();
        }
    }
    
    @Override
    public final void U0(final String s, final boolean b) {
        this.f.c();
        try {
            final Pair<k, Boolean> l1 = this.l1(s);
            this.U1(k.a((k)l1.component1(), false, 0L, null, null, null, b, 63), (boolean)l1.component2());
            this.f.q();
        }
        finally {
            this.f.m();
        }
    }
    
    public final void U1(final k k, final boolean b) {
        this.f.c();
        Label_0020: {
            if (!b) {
                break Label_0020;
            }
            try {
                this.update(k);
                while (true) {
                    this.f.q();
                    return;
                    this.N(new k[] { k });
                    continue;
                }
            }
            finally {
                this.f.m();
            }
        }
    }
    
    @Override
    public final ArrayList Y(final List list) {
        final StringBuilder m = b.m("\n", "      SELECT *", "\n", "      FROM link_mutations", "\n");
        m.append("      WHERE parentLinkId IN (");
        final int size = list.size();
        u1.v(size, m);
        m.append(")");
        m.append("\n");
        m.append("    ");
        final o a = o.a(size + 0, m.toString());
        final Iterator iterator = list.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final String s = (String)iterator.next();
            if (s == null) {
                a.bindNull(n);
            }
            else {
                a.bindString(n, s);
            }
            ++n;
        }
        this.f.b();
        final Cursor b = c.b(this.f, a, false);
        try {
            final int b2 = l5.b.b(b, "parentLinkId");
            final int b3 = l5.b.b(b, "isRead");
            final int b4 = l5.b.b(b, "readTimestampUtc");
            final int b5 = l5.b.b(b, "isHidden");
            final int b6 = l5.b.b(b, "isSubscribed");
            final int b7 = l5.b.b(b, "isSaved");
            final int b8 = l5.b.b(b, "isFollowed");
            final ArrayList list2 = new ArrayList<k>(b.getCount());
            while (b.moveToNext()) {
                String string;
                if (b.isNull(b2)) {
                    string = null;
                }
                else {
                    string = b.getString(b2);
                }
                final boolean b9 = b.getInt(b3) != 0;
                final long long1 = b.getLong(b4);
                Integer value;
                if (b.isNull(b5)) {
                    value = null;
                }
                else {
                    value = b.getInt(b5);
                }
                Boolean value2;
                if (value == null) {
                    value2 = null;
                }
                else {
                    value2 = (value != 0);
                }
                Integer value3;
                if (b.isNull(b6)) {
                    value3 = null;
                }
                else {
                    value3 = b.getInt(b6);
                }
                Boolean value4;
                if (value3 == null) {
                    value4 = null;
                }
                else {
                    value4 = (value3 != 0);
                }
                Integer value5;
                if (b.isNull(b7)) {
                    value5 = null;
                }
                else {
                    value5 = b.getInt(b7);
                }
                Boolean value6;
                if (value5 == null) {
                    value6 = null;
                }
                else {
                    value6 = (value5 != 0);
                }
                Integer value7;
                if (b.isNull(b8)) {
                    value7 = null;
                }
                else {
                    value7 = b.getInt(b8);
                }
                Boolean value8;
                if (value7 == null) {
                    value8 = null;
                }
                else {
                    value8 = (value7 != 0);
                }
                list2.add(new k(string, b9, long1, value2, value4, value6, value8));
            }
            return list2;
        }
        finally {
            b.close();
            a.h();
        }
    }
    
    @Override
    public final a k() {
        return a.q((Callable)new d0$h(this));
    }
    
    public final Pair<k, Boolean> l1(final String s) {
        this.f.c();
        try {
            final k s2 = this.S(s);
            Pair pair;
            if (s2 != null) {
                pair = new Pair((Object)s2, (Object)Boolean.TRUE);
            }
            else {
                pair = new Pair((Object)new k(s, 126), (Object)Boolean.FALSE);
            }
            this.f.q();
            return (Pair<k, Boolean>)pair;
        }
        finally {
            this.f.m();
        }
    }
    
    @Override
    public final a o() {
        return RxJavaPlugins.onAssembly((a)new f((Callable)new e0(this)));
    }
    
    public final int update(final Object o) {
        final k k = (k)o;
        this.f.b();
        this.f.c();
        try {
            final int e = this.h.e(k);
            this.f.q();
            this.f.m();
            return e + 0;
        }
        finally {
            this.f.m();
        }
    }
    
    @Override
    public final void v(final String s, final boolean b) {
        this.f.c();
        try {
            final Pair<k, Boolean> l1 = this.l1(s);
            this.U1(k.a((k)l1.component1(), false, 0L, null, null, b, null, 95), (boolean)l1.component2());
            this.f.q();
        }
        finally {
            this.f.m();
        }
    }
}
