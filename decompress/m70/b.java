// 
// Decompiled by Procyon v0.6.0
// 

package m70;

import n5.c;
import java.util.concurrent.Callable;
import j5.o;
import ff2.n;
import j5.d;
import j5.e;
import androidx.room.RoomDatabase;

public final class b implements a
{
    public final RoomDatabase f;
    public final b$c g;
    public final b$e h;
    
    public b(final RoomDatabase f) {
        this.f = f;
        new e<n70.a>(f) {
            public final String b() {
                return "INSERT OR ABORT INTO `meta_community_info` (`id`,`specialMembershipsEnabled`,`specialMembershipsBoughtBefore`,`userMembershipStart`,`userMembershipEnd`,`userMembershipCurrency`,`showSpecialMembershipBanner`,`pointsName`,`pointsImageGrayUrl`,`pointsImageFilledUrl`,`pointsDecimals`,`currency`,`renews`,`userHasActiveMembership`,`subscriptionAddress`,`membershipAlt`,`membership`,`memberAlt`,`memberAltPlural`,`member`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final n70.a a = (n70.a)o;
                final String a2 = a.a;
                if (a2 == null) {
                    ((c)e).bindNull(1);
                }
                else {
                    ((c)e).bindString(1, a2);
                }
                ((c)e).bindLong(2, a.b ? 1 : 0);
                ((c)e).bindLong(3, a.c ? 1 : 0);
                final Long d = a.d;
                if (d == null) {
                    ((c)e).bindNull(4);
                }
                else {
                    ((c)e).bindLong(4, d);
                }
                final Long e2 = a.e;
                if (e2 == null) {
                    ((c)e).bindNull(5);
                }
                else {
                    ((c)e).bindLong(5, e2);
                }
                final String f = a.f;
                if (f == null) {
                    ((c)e).bindNull(6);
                }
                else {
                    ((c)e).bindString(6, f);
                }
                ((c)e).bindLong(7, a.g ? 1 : 0);
                final String h = a.h;
                if (h == null) {
                    ((c)e).bindNull(8);
                }
                else {
                    ((c)e).bindString(8, h);
                }
                final String i = a.i;
                if (i == null) {
                    ((c)e).bindNull(9);
                }
                else {
                    ((c)e).bindString(9, i);
                }
                final String j = a.j;
                if (j == null) {
                    ((c)e).bindNull(10);
                }
                else {
                    ((c)e).bindString(10, j);
                }
                ((c)e).bindLong(11, a.k);
                final String l = a.l;
                if (l == null) {
                    ((c)e).bindNull(12);
                }
                else {
                    ((c)e).bindString(12, l);
                }
                ((c)e).bindLong(13, a.m ? 1 : 0);
                ((c)e).bindLong(14, a.n ? 1 : 0);
                final String o2 = a.o;
                if (o2 == null) {
                    ((c)e).bindNull(15);
                }
                else {
                    ((c)e).bindString(15, o2);
                }
                final n70.b p2 = a.p;
                if (p2 != null) {
                    final String a3 = p2.a;
                    if (a3 == null) {
                        ((c)e).bindNull(16);
                    }
                    else {
                        ((c)e).bindString(16, a3);
                    }
                    final String b = p2.b;
                    if (b == null) {
                        ((c)e).bindNull(17);
                    }
                    else {
                        ((c)e).bindString(17, b);
                    }
                    final String c = p2.c;
                    if (c == null) {
                        ((c)e).bindNull(18);
                    }
                    else {
                        ((c)e).bindString(18, c);
                    }
                    final String d2 = p2.d;
                    if (d2 == null) {
                        ((c)e).bindNull(19);
                    }
                    else {
                        ((c)e).bindString(19, d2);
                    }
                    final String e3 = p2.e;
                    if (e3 == null) {
                        ((c)e).bindNull(20);
                    }
                    else {
                        ((c)e).bindString(20, e3);
                    }
                }
                else {
                    ((c)e).bindNull(16);
                    ((c)e).bindNull(17);
                    ((c)e).bindNull(18);
                    ((c)e).bindNull(19);
                    ((c)e).bindNull(20);
                }
            }
        };
        new e<n70.a>(f) {
            public final String b() {
                return "INSERT OR REPLACE INTO `meta_community_info` (`id`,`specialMembershipsEnabled`,`specialMembershipsBoughtBefore`,`userMembershipStart`,`userMembershipEnd`,`userMembershipCurrency`,`showSpecialMembershipBanner`,`pointsName`,`pointsImageGrayUrl`,`pointsImageFilledUrl`,`pointsDecimals`,`currency`,`renews`,`userHasActiveMembership`,`subscriptionAddress`,`membershipAlt`,`membership`,`memberAlt`,`memberAltPlural`,`member`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final n70.a a = (n70.a)o;
                final String a2 = a.a;
                if (a2 == null) {
                    ((c)e).bindNull(1);
                }
                else {
                    ((c)e).bindString(1, a2);
                }
                ((c)e).bindLong(2, a.b ? 1 : 0);
                ((c)e).bindLong(3, a.c ? 1 : 0);
                final Long d = a.d;
                if (d == null) {
                    ((c)e).bindNull(4);
                }
                else {
                    ((c)e).bindLong(4, d);
                }
                final Long e2 = a.e;
                if (e2 == null) {
                    ((c)e).bindNull(5);
                }
                else {
                    ((c)e).bindLong(5, e2);
                }
                final String f = a.f;
                if (f == null) {
                    ((c)e).bindNull(6);
                }
                else {
                    ((c)e).bindString(6, f);
                }
                ((c)e).bindLong(7, a.g ? 1 : 0);
                final String h = a.h;
                if (h == null) {
                    ((c)e).bindNull(8);
                }
                else {
                    ((c)e).bindString(8, h);
                }
                final String i = a.i;
                if (i == null) {
                    ((c)e).bindNull(9);
                }
                else {
                    ((c)e).bindString(9, i);
                }
                final String j = a.j;
                if (j == null) {
                    ((c)e).bindNull(10);
                }
                else {
                    ((c)e).bindString(10, j);
                }
                ((c)e).bindLong(11, a.k);
                final String l = a.l;
                if (l == null) {
                    ((c)e).bindNull(12);
                }
                else {
                    ((c)e).bindString(12, l);
                }
                ((c)e).bindLong(13, a.m ? 1 : 0);
                ((c)e).bindLong(14, a.n ? 1 : 0);
                final String o2 = a.o;
                if (o2 == null) {
                    ((c)e).bindNull(15);
                }
                else {
                    ((c)e).bindString(15, o2);
                }
                final n70.b p2 = a.p;
                if (p2 != null) {
                    final String a3 = p2.a;
                    if (a3 == null) {
                        ((c)e).bindNull(16);
                    }
                    else {
                        ((c)e).bindString(16, a3);
                    }
                    final String b = p2.b;
                    if (b == null) {
                        ((c)e).bindNull(17);
                    }
                    else {
                        ((c)e).bindString(17, b);
                    }
                    final String c = p2.c;
                    if (c == null) {
                        ((c)e).bindNull(18);
                    }
                    else {
                        ((c)e).bindString(18, c);
                    }
                    final String d2 = p2.d;
                    if (d2 == null) {
                        ((c)e).bindNull(19);
                    }
                    else {
                        ((c)e).bindString(19, d2);
                    }
                    final String e3 = p2.e;
                    if (e3 == null) {
                        ((c)e).bindNull(20);
                    }
                    else {
                        ((c)e).bindString(20, e3);
                    }
                }
                else {
                    ((c)e).bindNull(16);
                    ((c)e).bindNull(17);
                    ((c)e).bindNull(18);
                    ((c)e).bindNull(19);
                    ((c)e).bindNull(20);
                }
            }
        };
        this.g = new e<n70.a>(f) {
            public final String b() {
                return "INSERT OR IGNORE INTO `meta_community_info` (`id`,`specialMembershipsEnabled`,`specialMembershipsBoughtBefore`,`userMembershipStart`,`userMembershipEnd`,`userMembershipCurrency`,`showSpecialMembershipBanner`,`pointsName`,`pointsImageGrayUrl`,`pointsImageFilledUrl`,`pointsDecimals`,`currency`,`renews`,`userHasActiveMembership`,`subscriptionAddress`,`membershipAlt`,`membership`,`memberAlt`,`memberAltPlural`,`member`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final n70.a a = (n70.a)o;
                final String a2 = a.a;
                if (a2 == null) {
                    ((c)e).bindNull(1);
                }
                else {
                    ((c)e).bindString(1, a2);
                }
                ((c)e).bindLong(2, a.b ? 1 : 0);
                ((c)e).bindLong(3, a.c ? 1 : 0);
                final Long d = a.d;
                if (d == null) {
                    ((c)e).bindNull(4);
                }
                else {
                    ((c)e).bindLong(4, d);
                }
                final Long e2 = a.e;
                if (e2 == null) {
                    ((c)e).bindNull(5);
                }
                else {
                    ((c)e).bindLong(5, e2);
                }
                final String f = a.f;
                if (f == null) {
                    ((c)e).bindNull(6);
                }
                else {
                    ((c)e).bindString(6, f);
                }
                ((c)e).bindLong(7, a.g ? 1 : 0);
                final String h = a.h;
                if (h == null) {
                    ((c)e).bindNull(8);
                }
                else {
                    ((c)e).bindString(8, h);
                }
                final String i = a.i;
                if (i == null) {
                    ((c)e).bindNull(9);
                }
                else {
                    ((c)e).bindString(9, i);
                }
                final String j = a.j;
                if (j == null) {
                    ((c)e).bindNull(10);
                }
                else {
                    ((c)e).bindString(10, j);
                }
                ((c)e).bindLong(11, a.k);
                final String l = a.l;
                if (l == null) {
                    ((c)e).bindNull(12);
                }
                else {
                    ((c)e).bindString(12, l);
                }
                ((c)e).bindLong(13, a.m ? 1 : 0);
                ((c)e).bindLong(14, a.n ? 1 : 0);
                final String o2 = a.o;
                if (o2 == null) {
                    ((c)e).bindNull(15);
                }
                else {
                    ((c)e).bindString(15, o2);
                }
                final n70.b p2 = a.p;
                if (p2 != null) {
                    final String a3 = p2.a;
                    if (a3 == null) {
                        ((c)e).bindNull(16);
                    }
                    else {
                        ((c)e).bindString(16, a3);
                    }
                    final String b = p2.b;
                    if (b == null) {
                        ((c)e).bindNull(17);
                    }
                    else {
                        ((c)e).bindString(17, b);
                    }
                    final String c = p2.c;
                    if (c == null) {
                        ((c)e).bindNull(18);
                    }
                    else {
                        ((c)e).bindString(18, c);
                    }
                    final String d2 = p2.d;
                    if (d2 == null) {
                        ((c)e).bindNull(19);
                    }
                    else {
                        ((c)e).bindString(19, d2);
                    }
                    final String e3 = p2.e;
                    if (e3 == null) {
                        ((c)e).bindNull(20);
                    }
                    else {
                        ((c)e).bindString(20, e3);
                    }
                }
                else {
                    ((c)e).bindNull(16);
                    ((c)e).bindNull(17);
                    ((c)e).bindNull(18);
                    ((c)e).bindNull(19);
                    ((c)e).bindNull(20);
                }
            }
        };
        new d<n70.a>(f) {
            public final String b() {
                return "DELETE FROM `meta_community_info` WHERE `id` = ?";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final String a = ((n70.a)o).a;
                if (a == null) {
                    ((c)e).bindNull(1);
                }
                else {
                    ((c)e).bindString(1, a);
                }
            }
        };
        this.h = new d<n70.a>(f) {
            public final String b() {
                return "UPDATE OR ABORT `meta_community_info` SET `id` = ?,`specialMembershipsEnabled` = ?,`specialMembershipsBoughtBefore` = ?,`userMembershipStart` = ?,`userMembershipEnd` = ?,`userMembershipCurrency` = ?,`showSpecialMembershipBanner` = ?,`pointsName` = ?,`pointsImageGrayUrl` = ?,`pointsImageFilledUrl` = ?,`pointsDecimals` = ?,`currency` = ?,`renews` = ?,`userHasActiveMembership` = ?,`subscriptionAddress` = ?,`membershipAlt` = ?,`membership` = ?,`memberAlt` = ?,`memberAltPlural` = ?,`member` = ? WHERE `id` = ?";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final n70.a a = (n70.a)o;
                final String a2 = a.a;
                if (a2 == null) {
                    ((c)e).bindNull(1);
                }
                else {
                    ((c)e).bindString(1, a2);
                }
                ((c)e).bindLong(2, a.b ? 1 : 0);
                ((c)e).bindLong(3, a.c ? 1 : 0);
                final Long d = a.d;
                if (d == null) {
                    ((c)e).bindNull(4);
                }
                else {
                    ((c)e).bindLong(4, d);
                }
                final Long e2 = a.e;
                if (e2 == null) {
                    ((c)e).bindNull(5);
                }
                else {
                    ((c)e).bindLong(5, e2);
                }
                final String f = a.f;
                if (f == null) {
                    ((c)e).bindNull(6);
                }
                else {
                    ((c)e).bindString(6, f);
                }
                ((c)e).bindLong(7, a.g ? 1 : 0);
                final String h = a.h;
                if (h == null) {
                    ((c)e).bindNull(8);
                }
                else {
                    ((c)e).bindString(8, h);
                }
                final String i = a.i;
                if (i == null) {
                    ((c)e).bindNull(9);
                }
                else {
                    ((c)e).bindString(9, i);
                }
                final String j = a.j;
                if (j == null) {
                    ((c)e).bindNull(10);
                }
                else {
                    ((c)e).bindString(10, j);
                }
                ((c)e).bindLong(11, a.k);
                final String l = a.l;
                if (l == null) {
                    ((c)e).bindNull(12);
                }
                else {
                    ((c)e).bindString(12, l);
                }
                ((c)e).bindLong(13, a.m ? 1 : 0);
                ((c)e).bindLong(14, a.n ? 1 : 0);
                final String o2 = a.o;
                if (o2 == null) {
                    ((c)e).bindNull(15);
                }
                else {
                    ((c)e).bindString(15, o2);
                }
                final n70.b p2 = a.p;
                if (p2 != null) {
                    final String a3 = p2.a;
                    if (a3 == null) {
                        ((c)e).bindNull(16);
                    }
                    else {
                        ((c)e).bindString(16, a3);
                    }
                    final String b = p2.b;
                    if (b == null) {
                        ((c)e).bindNull(17);
                    }
                    else {
                        ((c)e).bindString(17, b);
                    }
                    final String c = p2.c;
                    if (c == null) {
                        ((c)e).bindNull(18);
                    }
                    else {
                        ((c)e).bindString(18, c);
                    }
                    final String d2 = p2.d;
                    if (d2 == null) {
                        ((c)e).bindNull(19);
                    }
                    else {
                        ((c)e).bindString(19, d2);
                    }
                    final String e3 = p2.e;
                    if (e3 == null) {
                        ((c)e).bindNull(20);
                    }
                    else {
                        ((c)e).bindString(20, e3);
                    }
                }
                else {
                    ((c)e).bindNull(16);
                    ((c)e).bindNull(17);
                    ((c)e).bindNull(18);
                    ((c)e).bindNull(19);
                    ((c)e).bindNull(20);
                }
                final String a4 = a.a;
                if (a4 == null) {
                    ((c)e).bindNull(21);
                }
                else {
                    ((c)e).bindString(21, a4);
                }
            }
        };
    }
    
    public final long F(final Object o) {
        final n70.a a = (n70.a)o;
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
    
    public final void Z1(final n70.a a) {
        this.f.c();
        try {
            if (this.F(a) == -1L) {
                this.update(a);
            }
            this.f.q();
        }
        finally {
            this.f.m();
        }
    }
    
    public final n<n70.a> b(final String s) {
        final o a = o.a(1, "SELECT * FROM meta_community_info WHERE id=?");
        if (s == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, s);
        }
        return (n<n70.a>)n.m((Callable)new b$f(this, a));
    }
    
    public final int update(final Object o) {
        final n70.a a = (n70.a)o;
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
