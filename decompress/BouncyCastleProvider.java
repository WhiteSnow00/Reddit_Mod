// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.jce.provider;

import java.util.Dictionary;
import java.util.Iterator;
import java.util.Map;
import java.security.PublicKey;
import java.io.IOException;
import ok2.m;
import java.security.PrivateKey;
import ql2.b;
import zl2.e;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.HashMap;
import nl2.a;
import java.security.Provider;

public final class BouncyCastleProvider extends Provider
{
    public static final a CONFIGURATION;
    public static final String PROVIDER_NAME = "BC";
    public static final HashMap f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static final String[] k;
    public static final String[] l;
    public static final String[] m;
    public static final String[] n;
    
    static {
        CONFIGURATION = (a)new rl2.a();
        f = new HashMap();
        g = new String[] { "PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT" };
        h = new String[] { "SipHash", "SipHash128", "Poly1305" };
        i = new String[] { "AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015", "Zuc" };
        j = new String[] { "X509", "IES" };
        k = new String[] { "DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC" };
        l = new String[] { "GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka" };
        m = new String[] { "BC", "BCFKS", "PKCS12" };
        n = new String[] { "DRBG" };
    }
    
    public BouncyCastleProvider() {
        super("BC", 1.65, "BouncyCastle Security Provider v1.65");
        AccessController.doPrivileged((PrivilegedAction<Object>)new PrivilegedAction() {
            @Override
            public final Object run() {
                BouncyCastleProvider.access$000(BouncyCastleProvider.this);
                return null;
            }
        });
    }
    
    public static void access$000(final BouncyCastleProvider bouncyCastleProvider) {
        bouncyCastleProvider.c("org.bouncycastle.jcajce.provider.digest.", BouncyCastleProvider.l);
        bouncyCastleProvider.c("org.bouncycastle.jcajce.provider.symmetric.", BouncyCastleProvider.g);
        bouncyCastleProvider.c("org.bouncycastle.jcajce.provider.symmetric.", BouncyCastleProvider.h);
        bouncyCastleProvider.c("org.bouncycastle.jcajce.provider.symmetric.", BouncyCastleProvider.i);
        bouncyCastleProvider.c("org.bouncycastle.jcajce.provider.asymmetric.", BouncyCastleProvider.j);
        bouncyCastleProvider.c("org.bouncycastle.jcajce.provider.asymmetric.", BouncyCastleProvider.k);
        bouncyCastleProvider.c("org.bouncycastle.jcajce.provider.keystore.", BouncyCastleProvider.m);
        bouncyCastleProvider.c("org.bouncycastle.jcajce.provider.drbg.", BouncyCastleProvider.n);
        bouncyCastleProvider.addKeyInfoConverter(e.d, (b)new nm2.a());
        bouncyCastleProvider.addKeyInfoConverter(e.e, (b)new km2.a());
        bouncyCastleProvider.addKeyInfoConverter(e.f, (b)new om2.a());
        bouncyCastleProvider.addKeyInfoConverter(uk2.a.a, (b)new om2.a());
        bouncyCastleProvider.addKeyInfoConverter(e.g, (b)new om2.b());
        bouncyCastleProvider.addKeyInfoConverter(uk2.a.b, (b)new om2.b());
        bouncyCastleProvider.addKeyInfoConverter(e.b, (b)new jm2.b());
        bouncyCastleProvider.addKeyInfoConverter(e.c, (b)new jm2.a());
        bouncyCastleProvider.addKeyInfoConverter(e.a, (b)new mm2.a());
        bouncyCastleProvider.addKeyInfoConverter(e.h, new lm2.a());
        bouncyCastleProvider.addKeyInfoConverter(e.i, new lm2.a());
        bouncyCastleProvider.addKeyInfoConverter(xk2.a.a, (b)new im2.a());
        ((Dictionary<String, String>)bouncyCastleProvider).put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        ((Dictionary<String, String>)bouncyCastleProvider).put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        ((Dictionary<String, String>)bouncyCastleProvider).put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        ((Dictionary<String, String>)bouncyCastleProvider).put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        ((Dictionary<String, String>)bouncyCastleProvider).put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        ((Dictionary<String, String>)bouncyCastleProvider).put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        ((Dictionary<String, String>)bouncyCastleProvider).put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        ((Dictionary<String, String>)bouncyCastleProvider).put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        ((Dictionary<String, String>)bouncyCastleProvider).put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        ((Dictionary<String, String>)bouncyCastleProvider).put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        ((Dictionary<String, String>)bouncyCastleProvider).put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        ((Dictionary<String, String>)bouncyCastleProvider).put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        ((Dictionary<String, String>)bouncyCastleProvider).put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        ((Dictionary<String, String>)bouncyCastleProvider).put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        ((Dictionary<String, String>)bouncyCastleProvider).put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        ((Dictionary<String, String>)bouncyCastleProvider).put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        ((Dictionary<String, String>)bouncyCastleProvider).put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        ((Dictionary<String, String>)bouncyCastleProvider).put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        ((Dictionary<String, String>)bouncyCastleProvider).put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        ((Dictionary<String, String>)bouncyCastleProvider).put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        ((Dictionary<String, String>)bouncyCastleProvider).put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        ((Dictionary<String, String>)bouncyCastleProvider).put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        ((Dictionary<String, String>)bouncyCastleProvider).put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        ((Dictionary<String, String>)bouncyCastleProvider).put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        ((Dictionary<String, String>)bouncyCastleProvider).put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }
    
    public static PrivateKey getPrivateKey(final xk2.b b) throws IOException {
        final m f = b.g.f;
        final HashMap f2 = BouncyCastleProvider.f;
        synchronized (f2) {
            final b b2 = f2.get(f);
            monitorexit(f2);
            if (b2 == null) {
                return null;
            }
            return b2.a(b);
        }
    }
    
    public static PublicKey getPublicKey(final bl2.b b) throws IOException {
        final m f = b.f.f;
        final HashMap f2 = BouncyCastleProvider.f;
        synchronized (f2) {
            final b b2 = f2.get(f);
            monitorexit(f2);
            if (b2 == null) {
                return null;
            }
            return b2.b(b);
        }
    }
    
    public void addAlgorithm(final String s, final String s2) {
        if (!this.containsKey(s)) {
            ((Dictionary<String, String>)this).put(s, s2);
            return;
        }
        throw new IllegalStateException(a.k("duplicate provider key (", s, ") found"));
    }
    
    public void addAlgorithm(final String s, final m m, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(".");
        sb.append(m);
        this.addAlgorithm(sb.toString(), s2);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append(".OID.");
        sb2.append(m);
        this.addAlgorithm(sb2.toString(), s2);
    }
    
    public void addAttributes(final String s, final Map<String, String> map) {
        for (final String s2 : map.keySet()) {
            final String k = a.k(s, " ", s2);
            if (this.containsKey(k)) {
                throw new IllegalStateException(a.k("duplicate provider attribute key (", k, ") found"));
            }
            ((Dictionary<String, String>)this).put(k, map.get(s2));
        }
    }
    
    public void addKeyInfoConverter(final m m, final b b) {
        final HashMap f = BouncyCastleProvider.f;
        synchronized (f) {
            f.put(m, b);
        }
    }
    
    public final void c(final String s, final String[] array) {
        for (int i = 0; i != array.length; ++i) {
            final String o = a.o(a.r(s), array[i], "$Mappings");
            Class<?> loadClass;
            try {
                final ClassLoader classLoader = BouncyCastleProvider.class.getClassLoader();
                if (classLoader != null) {
                    loadClass = classLoader.loadClass(o);
                }
                else {
                    loadClass = AccessController.doPrivileged((PrivilegedAction<Class<?>>)new pl2.a(o));
                }
            }
            catch (final ClassNotFoundException ex) {
                loadClass = null;
            }
            if (loadClass != null) {
                try {
                    ((ql2.a)loadClass.newInstance()).a();
                }
                catch (final Exception ex2) {
                    final StringBuilder q = d.q("cannot create instance of ", s);
                    q.append(array[i]);
                    q.append("$Mappings : ");
                    q.append(ex2);
                    throw new InternalError(q.toString());
                }
            }
        }
    }
    
    public boolean hasAlgorithm(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(".");
        sb.append(s2);
        if (!this.containsKey(sb.toString())) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Alg.Alias.");
            sb2.append(s);
            sb2.append(".");
            sb2.append(s2);
            if (!this.containsKey(sb2.toString())) {
                return false;
            }
        }
        return true;
    }
    
    public void setParameter(final String s, final Object o) {
        final a configuration = BouncyCastleProvider.CONFIGURATION;
        synchronized (configuration) {
            ((rl2.a)configuration).a(s, o);
        }
    }
}
