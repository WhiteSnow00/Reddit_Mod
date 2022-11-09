// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.deeplinkdispatch;

import java.io.OutputStream;
import com.airbnb.deeplinkdispatch.base.UtilsKt;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import com.airbnb.deeplinkdispatch.base.Utils;
import kotlin.NoWhenBranchMatchedException;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003R\u001a\u0010\u0010\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e" }, d2 = { "Lcom/airbnb/deeplinkdispatch/Root;", "Lcom/airbnb/deeplinkdispatch/TreeNode;", "Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;", "deepLinkEntry", "Lcom/airbnb/deeplinkdispatch/UriMatch;", "uriMatch", "Ljava/io/OutputStream;", "openOutputStream", "Lpg2/j;", "writeToOutoutStream", "", "", "getStrings", "addToTrie", "", "component1", "id", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "deeplinkdispatch-base" }, k = 1, mv = { 1, 6, 0 })
public final class Root extends TreeNode
{
    private final String id;
    
    public Root() {
        this(null, 1, null);
    }
    
    public Root(final String id) {
        f.f((Object)id, "id");
        super("r", new NodeMetadata((byte)1, id));
        this.id = id;
    }
    
    private final UriMatch uriMatch(final DeepLinkEntry deepLinkEntry) {
        UriMatch uriMatch;
        if (deepLinkEntry instanceof DeepLinkEntry.ActivityDeeplinkEntry) {
            uriMatch = new UriMatch(MatchType.Activity, deepLinkEntry.getUriTemplate(), deepLinkEntry.getClassName(), (String)null);
        }
        else if (deepLinkEntry instanceof DeepLinkEntry.MethodDeeplinkEntry) {
            uriMatch = new UriMatch(MatchType.Method, deepLinkEntry.getUriTemplate(), deepLinkEntry.getClassName(), ((DeepLinkEntry.MethodDeeplinkEntry)deepLinkEntry).getMethod());
        }
        else {
            if (!(deepLinkEntry instanceof DeepLinkEntry.HandlerDeepLinkEntry)) {
                throw new NoWhenBranchMatchedException();
            }
            uriMatch = new UriMatch(MatchType.Handler, deepLinkEntry.getUriTemplate(), deepLinkEntry.getClassName(), (String)null);
        }
        return uriMatch;
    }
    
    public final void addToTrie(final DeepLinkEntry deepLinkEntry) {
        f.f((Object)deepLinkEntry, "deepLinkEntry");
        final DeepLinkUri template = DeepLinkUri.parseTemplate(deepLinkEntry.getUriTemplate());
        final String scheme = template.scheme();
        f.e((Object)scheme, "deepLinkUri.scheme()");
        final String orderPlaceholderValues = UrlTreeKt.orderPlaceholderValues(scheme);
        final Utils instance = Utils.INSTANCE;
        instance.validateIfComponentParam(orderPlaceholderValues);
        final TreeNode addNode = this.addNode((TreeNode)new Scheme(orderPlaceholderValues));
        final String host = template.host();
        final int n = 0;
        final boolean b = host == null || host.length() == 0;
        TreeNode addNode2 = addNode;
        if (!b) {
            final String host2 = template.host();
            f.e((Object)host2, "deepLinkUri.host()");
            final String orderPlaceholderValues2 = UrlTreeKt.orderPlaceholderValues(host2);
            instance.validateIfComponentParam(orderPlaceholderValues2);
            final TreeNode addNode3 = addNode.addNode((TreeNode)new Host(orderPlaceholderValues2));
            final List pathSegments = template.pathSegments();
            final boolean b2 = pathSegments == null || pathSegments.isEmpty();
            addNode2 = addNode3;
            if (b2) {
                addNode3.setMatch(this.uriMatch(deepLinkEntry));
                addNode2 = addNode3;
            }
        }
        final List pathSegments2 = template.pathSegments();
        int n2 = 0;
        Label_0214: {
            if (pathSegments2 != null) {
                n2 = n;
                if (!pathSegments2.isEmpty()) {
                    break Label_0214;
                }
            }
            n2 = 1;
        }
        if (n2 == 0) {
            for (final String s : template.pathSegments()) {
                f.e((Object)s, "pathSegment");
                final String orderPlaceholderValues3 = UrlTreeKt.orderPlaceholderValues(s);
                final Utils instance2 = Utils.INSTANCE;
                instance2.validateIfComponentParam(orderPlaceholderValues3);
                instance2.validateIfConfigurablePathSegment(orderPlaceholderValues3);
                addNode2 = addNode2.addNode((TreeNode)new PathSegment(orderPlaceholderValues3));
            }
            addNode2.setMatch(this.uriMatch(deepLinkEntry));
        }
    }
    
    public final String component1() {
        return this.getId();
    }
    
    public final Root copy(final String s) {
        f.f((Object)s, "id");
        return new Root(s);
    }
    
    public boolean equals(final Object o) {
        return this == o || (o instanceof Root && f.a((Object)this.getId(), (Object)((Root)o).getId()));
    }
    
    public String getId() {
        return this.id;
    }
    
    public final List<CharSequence> getStrings() {
        final byte[] uByteArray-TcUX1vc = this.toUByteArray-TcUX1vc();
        final byte[] copy = Arrays.copyOf(uByteArray-TcUX1vc, uByteArray-TcUX1vc.length);
        f.e((Object)copy, "copyOf(this, size)");
        final Charset forName = Charset.forName("ISO_8859_1");
        f.e((Object)forName, "forName(MATCH_INDEX_ENCODING)");
        return UtilsKt.chunkOnModifiedUtf8ByteSize((CharSequence)new String(copy, forName), 65535);
    }
    
    public int hashCode() {
        return this.getId().hashCode();
    }
    
    public String toString() {
        final StringBuilder k = a.k("Root(id=");
        k.append(this.getId());
        k.append(')');
        return k.toString();
    }
    
    public final void writeToOutoutStream(final OutputStream outputStream) {
        f.f((Object)outputStream, "openOutputStream");
        final byte[] uByteArray-TcUX1vc = this.toUByteArray-TcUX1vc();
        final byte[] copy = Arrays.copyOf(uByteArray-TcUX1vc, uByteArray-TcUX1vc.length);
        f.e((Object)copy, "copyOf(this, size)");
        outputStream.write(copy);
    }
}
