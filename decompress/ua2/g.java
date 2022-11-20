// 
// Decompiled by Procyon v0.6.0
// 

package ua2;

import com.reddit.vault.feature.errors.ErrorScreen$a;
import r82.u;
import y82.c;
import com.reddit.vault.feature.settings.SettingsScreenEntryPoint;
import java.math.BigInteger;
import com.reddit.vault.feature.registration.createvault.ConfirmRestorePreviousVaultScreen$a;
import com.reddit.vault.feature.vault.transfer.CommunityPickerScreen$a;
import java.util.List;
import com.reddit.vault.feature.vault.transaction.approve.ApproveTransactionScreen$a;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen$a;
import h92.j;
import e92.b;
import ra2.d;
import r82.r;
import r82.b0;
import r82.h;
import r82.l0;
import com.reddit.vault.navigation.NavStyle;
import r82.p;
import com.reddit.vault.feature.registration.createvault.IgnoreRecoveryConfirmationScreen$a;
import android.net.Uri;
import mg2.a;

public interface g
{
    void A(final mg2.a p0);
    
    void B();
    
    void C();
    
    void D();
    
    void E();
    
    void F();
    
    void G(final String p0);
    
    void H(final Uri p0);
    
    void I(final IgnoreRecoveryConfirmationScreen$a p0);
    
    void J(final p p0, final NavStyle p1, final a$a p2);
    
    void K(final l0 p0, final h p1);
    
    void L();
    
    void M(final b0 p0, final NavStyle p1);
    
    void a(final r p0);
    
    void b(final h p0, final ua2.a p1);
    
    void c(final d p0);
    
    void d(final String p0);
    
    void e(final b p0, final j p1, final NavStyle p2, final ua2.a p3);
    
    void f();
    
    void g(final String p0, final ja2.b p1);
    
    void h();
    
    void i(final boolean p0, final b92.a p1);
    
    void j(final r82.a p0, final MasterKeyScreen$a p1, final ua2.a p2, final mg2.a p3);
    
    void k(final j92.g p0, final MasterKeyScreen$a p1, final ua2.a p2, final mg2.a<cg2.j> p3);
    
    void l(final NavStyle p0, final a$a p1);
    
    void m(final p p0, final h p1, final la2.g.b p2, final ApproveTransactionScreen$a p3);
    
    void n();
    
    void o(final List<r82.j> p0, final CommunityPickerScreen$a p1);
    
    void p();
    
    void q(final String p0, final ja2.b p1);
    
    void r(final ConfirmRestorePreviousVaultScreen$a p0, final r82.a p1, final int p2, final BigInteger p3);
    
    void s();
    
    void t(final SettingsScreenEntryPoint p0);
    
    void u(final h p0);
    
    void v(final boolean p0, final b92.a p1);
    
    void w();
    
    void x(final String p0);
    
    void y(final c p0, final MasterKeyScreen$a p1, final u p2);
    
    void z(final c p0, final ErrorScreen$a p1, final NavStyle p2, final ua2.a p3);
    
    public static final class a
    {
        public static void a(final g g, final c c, ErrorScreen$a errorScreen$a, NavStyle push, a$a a$a, final int n) {
            if ((n & 0x2) != 0x0) {
                errorScreen$a = null;
            }
            if ((n & 0x4) != 0x0) {
                push = NavStyle.PUSH;
            }
            if ((n & 0x8) != 0x0) {
                a$a = new a$a(0);
            }
            g.z(c, errorScreen$a, push, (ua2.a)a$a);
        }
        
        public static void b(final g g, final r82.a a, final MasterKeyScreen$a masterKeyScreen$a, a$b a$b, final int n) {
            if ((n & 0x8) != 0x0) {
                a$b = new a$b(0);
            }
            g.j(a, masterKeyScreen$a, (ua2.a)a$b, null);
        }
    }
}
