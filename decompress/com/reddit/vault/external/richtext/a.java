// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.external.richtext;

import android.os.BaseBundle;
import java.util.Set;
import java.util.Iterator;
import cj2.j;
import cj2.k;
import ej2.g;
import lg2.c;
import java.math.BigInteger;
import com.reddit.vault.deeplink.VaultDeepLinkModule;
import android.os.Bundle;
import kotlin.collections.CollectionsKt___CollectionsKt;
import sg2.e;
import android.net.Uri;
import ig2.o;
import com.reddit.richtext.element.LinkElement;
import java.util.Collection;
import ig2.p;
import com.reddit.richtext.element.ParagraphElement;
import java.util.ArrayList;
import javax.inject.Inject;
import lw0.b;
import android.content.Context;
import java.util.List;
import pa1.m;

public final class a implements m
{
    public static final List<String> b;
    public final Context a;
    
    static {
        b = lw0.b.s1((Object[])new String[] { "reddit.com", "www.reddit.com" });
    }
    
    @Inject
    public a(final Context a) {
        this.a = a;
    }
    
    public final void a(final ArrayList list) {
        if (mf1.a.u(this.a).N3().h()) {
            return;
        }
        final ArrayList o3 = p.o3((Collection)list, (Class)ParagraphElement.class);
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = o3.iterator();
        while (iterator.hasNext()) {
            o.j3((Iterable)p.o3((Collection)((ParagraphElement)iterator.next()).b, (Class)LinkElement.class), (Collection)list2);
        }
        final Iterator iterator2 = list2.iterator();
        int n = 0;
    Label_0427_Outer:
        while (true) {
            if (!iterator2.hasNext()) {
                return;
            }
            final Object next = iterator2.next();
            String s = null;
            Label_0433: {
                if (n < 0) {
                    break Label_0433;
                }
                final LinkElement linkElement = (LinkElement)next;
                final Uri parse = Uri.parse(linkElement.c);
                while (true) {
                    if (!e.a((Object)parse.getPath(), (Object)"/vault/burn") || !e.a((Object)parse.getScheme(), (Object)"https")) {
                        break Label_0427;
                    }
                    if (!CollectionsKt___CollectionsKt.s3((Iterable)com.reddit.vault.external.richtext.a.b, (Object)parse.getHost())) {
                        break Label_0427;
                    }
                    final Bundle bundle = new Bundle();
                    final Set queryParameterNames = parse.getQueryParameterNames();
                    e.e((Object)queryParameterNames, "uri.queryParameterNames");
                    for (final String s2 : queryParameterNames) {
                        ((BaseBundle)bundle).putString(s2, parse.getQueryParameter(s2));
                    }
                    VaultDeepLinkModule.a.getClass();
                    final x82.o.c a = VaultDeepLinkModule.a(bundle);
                    if (a == null) {
                        break Label_0427;
                    }
                    try {
                        final String string = ((BaseBundle)bundle).getString("amount");
                        if (string != null) {
                            final BigInteger bigInteger = new BigInteger(string);
                            final String s3 = (String)g.k((rg2.p)new BurnLinkPostProcessingDelegate$postProcessRichText$2$pointsIconUrl$1(a, null));
                            final String queryParameter = parse.getQueryParameter("cta");
                            if (queryParameter != null) {
                                s = k.H1(20, queryParameter);
                            }
                            if (s == null || j.H0((CharSequence)s)) {
                                s = this.a.getString(2131952263);
                            }
                            list.add(new ParagraphElement("par", lw0.b.r1((Object)new qa1.a(linkElement.a, linkElement.c, bigInteger, s, s3, n == 0))));
                        }
                        ++n;
                        continue Label_0427_Outer;
                        lw0.b.I2();
                        throw null;
                    }
                    catch (final NumberFormatException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
}
