// 
// Decompiled by Procyon v0.6.0
// 

package n70;

import m5.d;
import java.util.concurrent.Callable;
import i5.k;
import af2.n;
import i5.e;
import i5.f;
import androidx.room.RoomDatabase;

public final class b implements a
{
    public final RoomDatabase f;
    public final b$c g;
    public final b$e h;
    
    public b(final RoomDatabase f) {
        this.f = f;
        new f<o70.a>(f) {
            public final String b() {
                return "INSERT OR ABORT INTO `meta_community_info` (`id`,`specialMembershipsEnabled`,`specialMembershipsBoughtBefore`,`userMembershipStart`,`userMembershipEnd`,`userMembershipCurrency`,`showSpecialMembershipBanner`,`pointsName`,`pointsImageGrayUrl`,`pointsImageFilledUrl`,`pointsDecimals`,`currency`,`renews`,`userHasActiveMembership`,`subscriptionAddress`,`membershipAlt`,`membership`,`memberAlt`,`memberAltPlural`,`member`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
            
            @Override
            public final void d(final m5.f f, final Object o) {
                final o70.a a = (o70.a)o;
                final String a2 = a.a;
                if (a2 == null) {
                    ((d)f).bindNull(1);
                }
                else {
                    ((d)f).bindString(1, a2);
                }
                ((d)f).bindLong(2, (long)(a.b ? 1 : 0));
                ((d)f).bindLong(3, (long)(a.c ? 1 : 0));
                final Long d = a.d;
                if (d == null) {
                    ((d)f).bindNull(4);
                }
                else {
                    ((d)f).bindLong(4, (long)d);
                }
                final Long e = a.e;
                if (e == null) {
                    ((d)f).bindNull(5);
                }
                else {
                    ((d)f).bindLong(5, (long)e);
                }
                final String f2 = a.f;
                if (f2 == null) {
                    ((d)f).bindNull(6);
                }
                else {
                    ((d)f).bindString(6, f2);
                }
                ((d)f).bindLong(7, (long)(a.g ? 1 : 0));
                final String h = a.h;
                if (h == null) {
                    ((d)f).bindNull(8);
                }
                else {
                    ((d)f).bindString(8, h);
                }
                final String i = a.i;
                if (i == null) {
                    ((d)f).bindNull(9);
                }
                else {
                    ((d)f).bindString(9, i);
                }
                final String j = a.j;
                if (j == null) {
                    ((d)f).bindNull(10);
                }
                else {
                    ((d)f).bindString(10, j);
                }
                ((d)f).bindLong(11, (long)a.k);
                final String l = a.l;
                if (l == null) {
                    ((d)f).bindNull(12);
                }
                else {
                    ((d)f).bindString(12, l);
                }
                ((d)f).bindLong(13, (long)(a.m ? 1 : 0));
                ((d)f).bindLong(14, (long)(a.n ? 1 : 0));
                final String o2 = a.o;
                if (o2 == null) {
                    ((d)f).bindNull(15);
                }
                else {
                    ((d)f).bindString(15, o2);
                }
                final o70.b p2 = a.p;
                if (p2 != null) {
                    final String a3 = p2.a;
                    if (a3 == null) {
                        ((d)f).bindNull(16);
                    }
                    else {
                        ((d)f).bindString(16, a3);
                    }
                    final String b = p2.b;
                    if (b == null) {
                        ((d)f).bindNull(17);
                    }
                    else {
                        ((d)f).bindString(17, b);
                    }
                    final String c = p2.c;
                    if (c == null) {
                        ((d)f).bindNull(18);
                    }
                    else {
                        ((d)f).bindString(18, c);
                    }
                    final String d2 = p2.d;
                    if (d2 == null) {
                        ((d)f).bindNull(19);
                    }
                    else {
                        ((d)f).bindString(19, d2);
                    }
                    final String e2 = p2.e;
                    if (e2 == null) {
                        ((d)f).bindNull(20);
                    }
                    else {
                        ((d)f).bindString(20, e2);
                    }
                }
                else {
                    ((d)f).bindNull(16);
                    ((d)f).bindNull(17);
                    ((d)f).bindNull(18);
                    ((d)f).bindNull(19);
                    ((d)f).bindNull(20);
                }
            }
        };
        new f<o70.a>(f) {
            public final String b() {
                return "INSERT OR REPLACE INTO `meta_community_info` (`id`,`specialMembershipsEnabled`,`specialMembershipsBoughtBefore`,`userMembershipStart`,`userMembershipEnd`,`userMembershipCurrency`,`showSpecialMembershipBanner`,`pointsName`,`pointsImageGrayUrl`,`pointsImageFilledUrl`,`pointsDecimals`,`currency`,`renews`,`userHasActiveMembership`,`subscriptionAddress`,`membershipAlt`,`membership`,`memberAlt`,`memberAltPlural`,`member`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
            
            @Override
            public final void d(final m5.f f, final Object o) {
                final o70.a a = (o70.a)o;
                final String a2 = a.a;
                if (a2 == null) {
                    ((d)f).bindNull(1);
                }
                else {
                    ((d)f).bindString(1, a2);
                }
                ((d)f).bindLong(2, (long)(a.b ? 1 : 0));
                ((d)f).bindLong(3, (long)(a.c ? 1 : 0));
                final Long d = a.d;
                if (d == null) {
                    ((d)f).bindNull(4);
                }
                else {
                    ((d)f).bindLong(4, (long)d);
                }
                final Long e = a.e;
                if (e == null) {
                    ((d)f).bindNull(5);
                }
                else {
                    ((d)f).bindLong(5, (long)e);
                }
                final String f2 = a.f;
                if (f2 == null) {
                    ((d)f).bindNull(6);
                }
                else {
                    ((d)f).bindString(6, f2);
                }
                ((d)f).bindLong(7, (long)(a.g ? 1 : 0));
                final String h = a.h;
                if (h == null) {
                    ((d)f).bindNull(8);
                }
                else {
                    ((d)f).bindString(8, h);
                }
                final String i = a.i;
                if (i == null) {
                    ((d)f).bindNull(9);
                }
                else {
                    ((d)f).bindString(9, i);
                }
                final String j = a.j;
                if (j == null) {
                    ((d)f).bindNull(10);
                }
                else {
                    ((d)f).bindString(10, j);
                }
                ((d)f).bindLong(11, (long)a.k);
                final String l = a.l;
                if (l == null) {
                    ((d)f).bindNull(12);
                }
                else {
                    ((d)f).bindString(12, l);
                }
                ((d)f).bindLong(13, (long)(a.m ? 1 : 0));
                ((d)f).bindLong(14, (long)(a.n ? 1 : 0));
                final String o2 = a.o;
                if (o2 == null) {
                    ((d)f).bindNull(15);
                }
                else {
                    ((d)f).bindString(15, o2);
                }
                final o70.b p2 = a.p;
                if (p2 != null) {
                    final String a3 = p2.a;
                    if (a3 == null) {
                        ((d)f).bindNull(16);
                    }
                    else {
                        ((d)f).bindString(16, a3);
                    }
                    final String b = p2.b;
                    if (b == null) {
                        ((d)f).bindNull(17);
                    }
                    else {
                        ((d)f).bindString(17, b);
                    }
                    final String c = p2.c;
                    if (c == null) {
                        ((d)f).bindNull(18);
                    }
                    else {
                        ((d)f).bindString(18, c);
                    }
                    final String d2 = p2.d;
                    if (d2 == null) {
                        ((d)f).bindNull(19);
                    }
                    else {
                        ((d)f).bindString(19, d2);
                    }
                    final String e2 = p2.e;
                    if (e2 == null) {
                        ((d)f).bindNull(20);
                    }
                    else {
                        ((d)f).bindString(20, e2);
                    }
                }
                else {
                    ((d)f).bindNull(16);
                    ((d)f).bindNull(17);
                    ((d)f).bindNull(18);
                    ((d)f).bindNull(19);
                    ((d)f).bindNull(20);
                }
            }
        };
        this.g = new f<o70.a>(f) {
            public final String b() {
                return "INSERT OR IGNORE INTO `meta_community_info` (`id`,`specialMembershipsEnabled`,`specialMembershipsBoughtBefore`,`userMembershipStart`,`userMembershipEnd`,`userMembershipCurrency`,`showSpecialMembershipBanner`,`pointsName`,`pointsImageGrayUrl`,`pointsImageFilledUrl`,`pointsDecimals`,`currency`,`renews`,`userHasActiveMembership`,`subscriptionAddress`,`membershipAlt`,`membership`,`memberAlt`,`memberAltPlural`,`member`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
            
            @Override
            public final void d(final m5.f f, final Object o) {
                final o70.a a = (o70.a)o;
                final String a2 = a.a;
                if (a2 == null) {
                    ((d)f).bindNull(1);
                }
                else {
                    ((d)f).bindString(1, a2);
                }
                ((d)f).bindLong(2, (long)(a.b ? 1 : 0));
                ((d)f).bindLong(3, (long)(a.c ? 1 : 0));
                final Long d = a.d;
                if (d == null) {
                    ((d)f).bindNull(4);
                }
                else {
                    ((d)f).bindLong(4, (long)d);
                }
                final Long e = a.e;
                if (e == null) {
                    ((d)f).bindNull(5);
                }
                else {
                    ((d)f).bindLong(5, (long)e);
                }
                final String f2 = a.f;
                if (f2 == null) {
                    ((d)f).bindNull(6);
                }
                else {
                    ((d)f).bindString(6, f2);
                }
                ((d)f).bindLong(7, (long)(a.g ? 1 : 0));
                final String h = a.h;
                if (h == null) {
                    ((d)f).bindNull(8);
                }
                else {
                    ((d)f).bindString(8, h);
                }
                final String i = a.i;
                if (i == null) {
                    ((d)f).bindNull(9);
                }
                else {
                    ((d)f).bindString(9, i);
                }
                final String j = a.j;
                if (j == null) {
                    ((d)f).bindNull(10);
                }
                else {
                    ((d)f).bindString(10, j);
                }
                ((d)f).bindLong(11, (long)a.k);
                final String l = a.l;
                if (l == null) {
                    ((d)f).bindNull(12);
                }
                else {
                    ((d)f).bindString(12, l);
                }
                ((d)f).bindLong(13, (long)(a.m ? 1 : 0));
                ((d)f).bindLong(14, (long)(a.n ? 1 : 0));
                final String o2 = a.o;
                if (o2 == null) {
                    ((d)f).bindNull(15);
                }
                else {
                    ((d)f).bindString(15, o2);
                }
                final o70.b p2 = a.p;
                if (p2 != null) {
                    final String a3 = p2.a;
                    if (a3 == null) {
                        ((d)f).bindNull(16);
                    }
                    else {
                        ((d)f).bindString(16, a3);
                    }
                    final String b = p2.b;
                    if (b == null) {
                        ((d)f).bindNull(17);
                    }
                    else {
                        ((d)f).bindString(17, b);
                    }
                    final String c = p2.c;
                    if (c == null) {
                        ((d)f).bindNull(18);
                    }
                    else {
                        ((d)f).bindString(18, c);
                    }
                    final String d2 = p2.d;
                    if (d2 == null) {
                        ((d)f).bindNull(19);
                    }
                    else {
                        ((d)f).bindString(19, d2);
                    }
                    final String e2 = p2.e;
                    if (e2 == null) {
                        ((d)f).bindNull(20);
                    }
                    else {
                        ((d)f).bindString(20, e2);
                    }
                }
                else {
                    ((d)f).bindNull(16);
                    ((d)f).bindNull(17);
                    ((d)f).bindNull(18);
                    ((d)f).bindNull(19);
                    ((d)f).bindNull(20);
                }
            }
        };
        new e<o70.a>(f) {
            public final String b() {
                return "DELETE FROM `meta_community_info` WHERE `id` = ?";
            }
            
            @Override
            public final void d(final m5.f f, final Object o) {
                final String a = ((o70.a)o).a;
                if (a == null) {
                    ((d)f).bindNull(1);
                }
                else {
                    ((d)f).bindString(1, a);
                }
            }
        };
        this.h = new e<o70.a>(f) {
            public final String b() {
                return "UPDATE OR ABORT `meta_community_info` SET `id` = ?,`specialMembershipsEnabled` = ?,`specialMembershipsBoughtBefore` = ?,`userMembershipStart` = ?,`userMembershipEnd` = ?,`userMembershipCurrency` = ?,`showSpecialMembershipBanner` = ?,`pointsName` = ?,`pointsImageGrayUrl` = ?,`pointsImageFilledUrl` = ?,`pointsDecimals` = ?,`currency` = ?,`renews` = ?,`userHasActiveMembership` = ?,`subscriptionAddress` = ?,`membershipAlt` = ?,`membership` = ?,`memberAlt` = ?,`memberAltPlural` = ?,`member` = ? WHERE `id` = ?";
            }
            
            @Override
            public final void d(final m5.f f, final Object o) {
                final o70.a a = (o70.a)o;
                final String a2 = a.a;
                if (a2 == null) {
                    ((d)f).bindNull(1);
                }
                else {
                    ((d)f).bindString(1, a2);
                }
                ((d)f).bindLong(2, (long)(a.b ? 1 : 0));
                ((d)f).bindLong(3, (long)(a.c ? 1 : 0));
                final Long d = a.d;
                if (d == null) {
                    ((d)f).bindNull(4);
                }
                else {
                    ((d)f).bindLong(4, (long)d);
                }
                final Long e = a.e;
                if (e == null) {
                    ((d)f).bindNull(5);
                }
                else {
                    ((d)f).bindLong(5, (long)e);
                }
                final String f2 = a.f;
                if (f2 == null) {
                    ((d)f).bindNull(6);
                }
                else {
                    ((d)f).bindString(6, f2);
                }
                ((d)f).bindLong(7, (long)(a.g ? 1 : 0));
                final String h = a.h;
                if (h == null) {
                    ((d)f).bindNull(8);
                }
                else {
                    ((d)f).bindString(8, h);
                }
                final String i = a.i;
                if (i == null) {
                    ((d)f).bindNull(9);
                }
                else {
                    ((d)f).bindString(9, i);
                }
                final String j = a.j;
                if (j == null) {
                    ((d)f).bindNull(10);
                }
                else {
                    ((d)f).bindString(10, j);
                }
                ((d)f).bindLong(11, (long)a.k);
                final String l = a.l;
                if (l == null) {
                    ((d)f).bindNull(12);
                }
                else {
                    ((d)f).bindString(12, l);
                }
                ((d)f).bindLong(13, (long)(a.m ? 1 : 0));
                ((d)f).bindLong(14, (long)(a.n ? 1 : 0));
                final String o2 = a.o;
                if (o2 == null) {
                    ((d)f).bindNull(15);
                }
                else {
                    ((d)f).bindString(15, o2);
                }
                final o70.b p2 = a.p;
                if (p2 != null) {
                    final String a3 = p2.a;
                    if (a3 == null) {
                        ((d)f).bindNull(16);
                    }
                    else {
                        ((d)f).bindString(16, a3);
                    }
                    final String b = p2.b;
                    if (b == null) {
                        ((d)f).bindNull(17);
                    }
                    else {
                        ((d)f).bindString(17, b);
                    }
                    final String c = p2.c;
                    if (c == null) {
                        ((d)f).bindNull(18);
                    }
                    else {
                        ((d)f).bindString(18, c);
                    }
                    final String d2 = p2.d;
                    if (d2 == null) {
                        ((d)f).bindNull(19);
                    }
                    else {
                        ((d)f).bindString(19, d2);
                    }
                    final String e2 = p2.e;
                    if (e2 == null) {
                        ((d)f).bindNull(20);
                    }
                    else {
                        ((d)f).bindString(20, e2);
                    }
                }
                else {
                    ((d)f).bindNull(16);
                    ((d)f).bindNull(17);
                    ((d)f).bindNull(18);
                    ((d)f).bindNull(19);
                    ((d)f).bindNull(20);
                }
                final String a4 = a.a;
                if (a4 == null) {
                    ((d)f).bindNull(21);
                }
                else {
                    ((d)f).bindString(21, a4);
                }
            }
        };
    }
    
    public final long D(final Object o) {
        final o70.a a = (o70.a)o;
        this.f.b();
        this.f.c();
        try {
            final long h = this.g.h(a);
            this.f.q();
            return h;
        }
        finally {
            this.f.m();
        }
    }
    
    public final void N1(final o70.a a) {
        this.f.c();
        try {
            if (this.D(a) == -1L) {
                this.update(a);
            }
            this.f.q();
        }
        finally {
            this.f.m();
        }
    }
    
    public final n<o70.a> b(final String s) {
        final k d = k.d(1, "SELECT * FROM meta_community_info WHERE id=?");
        if (s == null) {
            d.bindNull(1);
        }
        else {
            d.bindString(1, s);
        }
        return (n<o70.a>)n.n((Callable<?>)new b$f(this, d));
    }
    
    public final int update(final Object o) {
        final o70.a a = (o70.a)o;
        this.f.b();
        this.f.c();
        try {
            final int e = this.h.e(a);
            this.f.q();
            this.f.m();
            return e + 0;
        }
        finally {
            this.f.m();
        }
    }
}
