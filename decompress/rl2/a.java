// 
// Decompiled by Procyon v0.6.0
// 

package rl2;

import javax.crypto.spec.DHParameterSpec;
import java.security.spec.ECParameterSpec;
import sl2.c;
import java.security.Permission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

public final class a implements nl2.a
{
    public static ProviderConfigurationPermission f;
    public static ProviderConfigurationPermission g;
    public static ProviderConfigurationPermission h;
    public static ProviderConfigurationPermission i;
    public static ProviderConfigurationPermission j;
    public static ProviderConfigurationPermission k;
    public ThreadLocal a;
    public ThreadLocal b;
    public volatile Object c;
    public volatile Set d;
    public volatile Map e;
    
    static {
        a.f = new ProviderConfigurationPermission("BC", "threadLocalEcImplicitlyCa");
        a.g = new ProviderConfigurationPermission("BC", "ecImplicitlyCa");
        a.h = new ProviderConfigurationPermission("BC", "threadLocalDhDefaultParams");
        a.i = new ProviderConfigurationPermission("BC", "DhDefaultParams");
        a.j = new ProviderConfigurationPermission("BC", "acceptableEcCurves");
        a.k = new ProviderConfigurationPermission("BC", "additionalEcParameters");
    }
    
    public a() {
        this.a = new ThreadLocal();
        this.b = new ThreadLocal();
        new HashSet();
        new HashMap();
    }
    
    public final void a(final String s, final Object c) {
        final SecurityManager securityManager = System.getSecurityManager();
        ThreadLocal threadLocal;
        if (s.equals("threadLocalEcImplicitlyCa")) {
            if (securityManager != null) {
                securityManager.checkPermission(rl2.a.f);
            }
            c a;
            if (!(c instanceof c) && c != null) {
                a = ml2.a.a((ECParameterSpec)c);
            }
            else {
                a = (c)c;
            }
            if (a != null) {
                this.a.set(a);
                return;
            }
            threadLocal = this.a;
        }
        else if (s.equals("ecImplicitlyCa")) {
            if (securityManager != null) {
                securityManager.checkPermission(rl2.a.g);
            }
            if (!(c instanceof c) && c != null) {
                ml2.a.a((ECParameterSpec)c);
                return;
            }
            final c c2 = (c)c;
            return;
        }
        else if (s.equals("threadLocalDhDefaultParams")) {
            if (securityManager != null) {
                securityManager.checkPermission(rl2.a.h);
            }
            if (!(c instanceof DHParameterSpec) && !(c instanceof DHParameterSpec[]) && c != null) {
                throw new IllegalArgumentException("not a valid DHParameterSpec");
            }
            threadLocal = this.b;
            if (c != null) {
                threadLocal.set(c);
                return;
            }
        }
        else if (s.equals("DhDefaultParams")) {
            if (securityManager != null) {
                securityManager.checkPermission(rl2.a.i);
            }
            if (!(c instanceof DHParameterSpec) && !(c instanceof DHParameterSpec[]) && c != null) {
                throw new IllegalArgumentException("not a valid DHParameterSpec or DHParameterSpec[]");
            }
            this.c = c;
            return;
        }
        else {
            if (s.equals("acceptableEcCurves")) {
                if (securityManager != null) {
                    securityManager.checkPermission(rl2.a.j);
                }
                this.d = (Set)c;
                return;
            }
            if (s.equals("additionalEcParameters")) {
                if (securityManager != null) {
                    securityManager.checkPermission(rl2.a.k);
                }
                this.e = (Map)c;
            }
            return;
        }
        threadLocal.remove();
    }
}
