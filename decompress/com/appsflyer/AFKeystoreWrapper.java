// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer;

import java.util.Enumeration;
import java.security.spec.AlgorithmParameterSpec;
import java.security.KeyPairGenerator;
import android.security.KeyPairGeneratorSpec$Builder;
import com.appsflyer.internal.ac;
import java.math.BigInteger;
import javax.security.auth.x500.X500Principal;
import android.security.keystore.KeyGenParameterSpec$Builder;
import android.os.Build$VERSION;
import java.util.Calendar;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.security.cert.CertificateException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.KeyStoreException;
import com.bytedance.covode.number.Covode;
import java.security.KeyStore;
import android.content.Context;

public class AFKeystoreWrapper
{
    public final Object AFInAppEventParameterName;
    public Context AFInAppEventType;
    public KeyStore AFKeystoreWrapper;
    public String valueOf;
    public int values;
    
    static {
        Covode.recordClassIndex(2540);
    }
    
    public AFKeystoreWrapper(Context instance) {
        this.AFInAppEventParameterName = new Object();
        this.AFInAppEventType = (Context)instance;
        this.valueOf = "";
        this.values = 0;
        AFLogger.valueOf("Initialising KeyStore..");
        try {
            instance = (KeyStoreException)KeyStore.getInstance("AndroidKeyStore");
            (this.AFKeystoreWrapper = (KeyStore)instance).load(null);
            return;
        }
        catch (final KeyStoreException instance) {}
        catch (final NoSuchAlgorithmException instance) {}
        catch (final IOException instance) {}
        catch (final CertificateException ex) {}
        AFLogger.valueOf("Couldn't load keystore instance of type: AndroidKeyStore", instance);
    }
    
    public static boolean valueOf(final String s) {
        return s.startsWith("com.appsflyer");
    }
    
    public final String AFInAppEventParameterName() {
        MethodCollector.i(225);
        final Object afInAppEventParameterName = this.AFInAppEventParameterName;
        monitorenter(afInAppEventParameterName);
        try {
            return this.valueOf;
        }
        finally {
            monitorexit(afInAppEventParameterName);
            MethodCollector.o(225);
        }
    }
    
    public final String AFInAppEventType() {
        MethodCollector.i(6924);
        final StringBuilder sb = new StringBuilder();
        sb.append("com.appsflyer,");
        Object o = this.AFInAppEventParameterName;
        monitorenter(o);
        try {
            sb.append("KSAppsFlyerId=");
            sb.append(this.valueOf);
            sb.append(",");
            sb.append("KSAppsFlyerRICounter=");
            sb.append(this.values);
            monitorexit(o);
            o = sb.toString();
            MethodCollector.o(6924);
            return (String)o;
        }
        finally {
            monitorexit(o);
            MethodCollector.o(6924);
        }
    }
    
    public final void AFKeystoreWrapper(final String alias) {
        MethodCollector.i(5678);
        AFLogger.valueOf("Creating a new key with alias: ".concat(String.valueOf(alias)));
        try {
            final Calendar instance = Calendar.getInstance();
            final Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 5);
            Object o = null;
            final Object afInAppEventParameterName = this.AFInAppEventParameterName;
            monitorenter(afInAppEventParameterName);
            try {
                if (!this.AFKeystoreWrapper.containsAlias(alias)) {
                    if (Build$VERSION.SDK_INT >= 23) {
                        o = new KeyGenParameterSpec$Builder(alias, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(instance.getTime()).setCertificateNotAfter(instance2.getTime()).build();
                    }
                    else if (!ac.AFInAppEventParameterName()) {
                        o = new KeyPairGeneratorSpec$Builder(this.AFInAppEventType).setAlias(alias).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
                    }
                    final KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    instance3.initialize((AlgorithmParameterSpec)o);
                    instance3.generateKeyPair();
                }
                else {
                    AFLogger.valueOf("Alias already exists: ".concat(String.valueOf(alias)));
                }
                monitorexit(afInAppEventParameterName);
                MethodCollector.o(5678);
            }
            finally {
                monitorexit(afInAppEventParameterName);
                MethodCollector.o(5678);
            }
        }
        finally {
            final StringBuilder sb = new StringBuilder("Exception ");
            final Throwable t;
            sb.append(t.getMessage());
            sb.append(" occurred");
            AFLogger.valueOf(sb.toString(), t);
            MethodCollector.o(5678);
        }
    }
    
    public final int valueOf() {
        MethodCollector.i(444);
        final Object afInAppEventParameterName = this.AFInAppEventParameterName;
        monitorenter(afInAppEventParameterName);
        try {
            return this.values;
        }
        finally {
            monitorexit(afInAppEventParameterName);
            MethodCollector.o(444);
        }
    }
    
    public final boolean values() {
        MethodCollector.i(2661);
        final Object afInAppEventParameterName = this.AFInAppEventParameterName;
        monitorenter(afInAppEventParameterName);
        try {
            final KeyStore afKeystoreWrapper = this.AFKeystoreWrapper;
            if (afKeystoreWrapper != null) {
                boolean b = false;
                Label_0190: {
                    try {
                        final Enumeration<String> aliases = afKeystoreWrapper.aliases();
                        String s = null;
                        Block_7: {
                            while (aliases.hasMoreElements()) {
                                s = aliases.nextElement();
                                if (s != null && valueOf(s)) {
                                    break Block_7;
                                }
                            }
                            return false;
                        }
                        final String[] split = s.split(",");
                        if (split.length == 3) {
                            AFLogger.valueOf("Found a matching AF key with alias:\n".concat(String.valueOf(s)));
                            try {
                                final String[] split2 = split[1].trim().split("=");
                                final String[] split3 = split[2].trim().split("=");
                                if (split2.length != 2 || split3.length != 2) {
                                    return b;
                                }
                                this.valueOf = split2[1].trim();
                                this.values = Integer.parseInt(split3[1].trim());
                            }
                            finally {}
                        }
                    }
                    finally {
                        b = false;
                        break Label_0190;
                    }
                    return false;
                }
                final StringBuilder sb = new StringBuilder("Couldn't list KeyStore Aliases: ");
                final Throwable t;
                sb.append(t.getClass().getName());
                AFLogger.valueOf(sb.toString(), t);
                return b;
            }
            return false;
        }
        finally {
            monitorexit(afInAppEventParameterName);
            MethodCollector.o(2661);
        }
    }
}
