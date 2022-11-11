// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.i18n;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;

public class MissingEntryException extends RuntimeException
{
    private String debugMsg;
    public final String key;
    public final ClassLoader loader;
    public final Locale locale;
    public final String resource;
    
    public MissingEntryException(final String s, final String resource, final String key, final Locale locale, final ClassLoader loader) {
        super(s);
        this.resource = resource;
        this.key = key;
        this.locale = locale;
        this.loader = loader;
    }
    
    public MissingEntryException(final String s, final Throwable t, final String resource, final String key, final Locale locale, final ClassLoader loader) {
        super(s, t);
        this.resource = resource;
        this.key = key;
        this.locale = locale;
        this.loader = loader;
    }
    
    public ClassLoader getClassLoader() {
        return this.loader;
    }
    
    public String getDebugMsg() {
        if (this.debugMsg == null) {
            final StringBuilder r = a.r("Can not find entry ");
            r.append(this.key);
            r.append(" in resource file ");
            r.append(this.resource);
            r.append(" for the locale ");
            r.append(this.locale);
            r.append(".");
            this.debugMsg = r.toString();
            final ClassLoader loader = this.loader;
            if (loader instanceof URLClassLoader) {
                final URL[] urLs = ((URLClassLoader)loader).getURLs();
                this.debugMsg = a.o(new StringBuilder(), this.debugMsg, " The following entries in the classpath were searched: ");
                for (int i = 0; i != urLs.length; ++i) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.debugMsg);
                    sb.append(urLs[i]);
                    sb.append(" ");
                    this.debugMsg = sb.toString();
                }
            }
        }
        return this.debugMsg;
    }
    
    public String getKey() {
        return this.key;
    }
    
    public Locale getLocale() {
        return this.locale;
    }
    
    public String getResource() {
        return this.resource;
    }
}
