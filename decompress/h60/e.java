// 
// Decompiled by Procyon v0.6.0
// 

package h60;

import ah2.f;
import android.database.Cursor;
import l5.c;
import j5.o;
import i60.b;
import androidx.room.RoomDatabase;

public final class e implements d
{
    public final RoomDatabase f;
    public final e$c g;
    public final e$e h;
    
    public e(final RoomDatabase f) {
        this.f = f;
        new j5.e<b>(f) {
            public final String b() {
                return "INSERT OR ABORT INTO `account_mutations` (`parentAccountId`,`hasBeenVisited`) VALUES (?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final b b = (b)o;
                final String a = b.a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
                final Boolean b2 = b.b;
                Integer value;
                if (b2 == null) {
                    value = null;
                }
                else {
                    value = (((boolean)b2) ? 1 : 0);
                }
                if (value == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindLong(2, value);
                }
            }
        };
        new j5.e<b>(f) {
            public final String b() {
                return "INSERT OR REPLACE INTO `account_mutations` (`parentAccountId`,`hasBeenVisited`) VALUES (?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final b b = (b)o;
                final String a = b.a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
                final Boolean b2 = b.b;
                Integer value;
                if (b2 == null) {
                    value = null;
                }
                else {
                    value = (((boolean)b2) ? 1 : 0);
                }
                if (value == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindLong(2, value);
                }
            }
        };
        this.g = new j5.e<b>(f) {
            public final String b() {
                return "INSERT OR IGNORE INTO `account_mutations` (`parentAccountId`,`hasBeenVisited`) VALUES (?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final b b = (b)o;
                final String a = b.a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
                final Boolean b2 = b.b;
                Integer value;
                if (b2 == null) {
                    value = null;
                }
                else {
                    value = (((boolean)b2) ? 1 : 0);
                }
                if (value == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindLong(2, value);
                }
            }
        };
        new j5.d<b>(f) {
            public final String b() {
                return "DELETE FROM `account_mutations` WHERE `parentAccountId` = ?";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final String a = ((b)o).a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
            }
        };
        this.h = new j5.d<b>(f) {
            public final String b() {
                return "UPDATE OR ABORT `account_mutations` SET `parentAccountId` = ?,`hasBeenVisited` = ? WHERE `parentAccountId` = ?";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final b b = (b)o;
                final String a = b.a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
                final Boolean b2 = b.b;
                Integer value;
                if (b2 == null) {
                    value = null;
                }
                else {
                    value = (((boolean)b2) ? 1 : 0);
                }
                if (value == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindLong(2, value);
                }
                final String a2 = b.a;
                if (a2 == null) {
                    e.bindNull(3);
                }
                else {
                    e.bindString(3, a2);
                }
            }
        };
    }
    
    public final long F(final Object o) {
        final b b = (b)o;
        this.f.b();
        this.f.c();
        try {
            final long h = this.g.h(b);
            this.f.q();
            return h;
        }
        finally {
            this.f.m();
        }
    }
    
    public final b S(String string) {
        boolean b = true;
        final o a = o.a(1, "\n      SELECT * FROM account_mutations\n      WHERE parentAccountId = ?\n    ");
        a.bindString(1, string);
        this.f.b();
        final RoomDatabase f = this.f;
        b b2 = null;
        final Boolean b3 = null;
        final Cursor b4 = c.b(f, a, false);
        try {
            final int b5 = l5.b.b(b4, "parentAccountId");
            final int b6 = l5.b.b(b4, "hasBeenVisited");
            if (b4.moveToFirst()) {
                if (b4.isNull(b5)) {
                    string = null;
                }
                else {
                    string = b4.getString(b5);
                }
                Integer value;
                if (b4.isNull(b6)) {
                    value = null;
                }
                else {
                    value = b4.getInt(b6);
                }
                Boolean value2;
                if (value == null) {
                    value2 = b3;
                }
                else {
                    if (value == 0) {
                        b = false;
                    }
                    value2 = b;
                }
                b2 = new b(string, value2);
            }
            return b2;
        }
        finally {
            b4.close();
            a.h();
        }
    }
    
    public final void U1(final b b) {
        this.f.c();
        try {
            if (this.F(b) == -1L) {
                this.update(b);
            }
            this.f.q();
        }
        finally {
            this.f.m();
        }
    }
    
    @Override
    public final void i(final String s) {
        this.f.c();
        try {
            final b l1 = this.l1(s);
            final Boolean true = Boolean.TRUE;
            final String a = l1.a;
            ah2.f.f((Object)a, "parentAccountId");
            this.U1(new b(a, true));
            this.f.q();
        }
        finally {
            this.f.m();
        }
    }
    
    public final b l1(final String s) {
        this.f.c();
        try {
            b s2;
            if ((s2 = this.S(s)) == null) {
                s2 = new b(s, null);
            }
            this.f.q();
            return s2;
        }
        finally {
            this.f.m();
        }
    }
    
    public final int update(final Object o) {
        final b b = (b)o;
        this.f.b();
        this.f.c();
        try {
            final int e = this.h.e(b);
            this.f.q();
            this.f.m();
            return e + 0;
        }
        finally {
            this.f.m();
        }
    }
}
