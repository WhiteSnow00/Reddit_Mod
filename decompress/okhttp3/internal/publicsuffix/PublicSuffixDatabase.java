// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.publicsuffix;

import okhttp3.internal._UtilCommonKt;
import bj2.k;
import java.net.IDN;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.io.InterruptedIOException;
import java.io.IOException;
import jk2.b0;
import java.io.InputStream;
import java.io.Closeable;
import hg2.j;
import jk2.g0;
import jk2.o;
import jk2.u;
import kotlin.collections.EmptyList;
import lw0.b;
import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u001a" }, d2 = { "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "domain", "", "splitDomain", "domainLabels", "findMatchingRule", "Lhg2/j;", "readTheListUninterruptibly", "readTheList", "getEffectiveTldPlusOne", "", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "setListBytes", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "[B", "<init>", "()V", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class PublicSuffixDatabase
{
    public static final Companion Companion;
    private static final char EXCEPTION_MARKER = '!';
    private static final List<String> PREVAILING_RULE;
    public static final String PUBLIC_SUFFIX_RESOURCE;
    private static final byte[] WILDCARD_LABEL;
    private static final PublicSuffixDatabase instance;
    private final AtomicBoolean listRead;
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    private final CountDownLatch readCompleteLatch;
    
    static {
        Companion = new Companion(null);
        PUBLIC_SUFFIX_RESOURCE = e.l((Object)".gz", "PublicSuffixDatabase");
        WILDCARD_LABEL = new byte[] { 42 };
        PREVAILING_RULE = b.r1((Object)"*");
        instance = new PublicSuffixDatabase();
    }
    
    public PublicSuffixDatabase() {
        this.listRead = new AtomicBoolean(false);
        this.readCompleteLatch = new CountDownLatch(1);
    }
    
    public static final /* synthetic */ PublicSuffixDatabase access$getInstance$cp() {
        return PublicSuffixDatabase.instance;
    }
    
    private final List<String> findMatchingRule(final List<String> list) {
        if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
            this.readTheListUninterruptibly();
        }
        else {
            try {
                this.readCompleteLatch.await();
            }
            catch (final InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException(a.o(a.r("Unable to load "), PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE, " resource from the classpath.").toString());
        }
        final int size = list.size();
        final byte[][] array = new byte[size][];
        for (int i = 0; i < size; ++i) {
            final byte[] bytes = list.get(i).getBytes(cj2.a.b);
            e.e((Object)bytes, "this as java.lang.String).getBytes(charset)");
            array[i] = bytes;
        }
        int n = 0;
        List list2;
        String access$binarySearch;
        while (true) {
            list2 = null;
            if (n >= size) {
                access$binarySearch = null;
                break;
            }
            final Companion companion = PublicSuffixDatabase.Companion;
            final byte[] publicSuffixListBytes = this.publicSuffixListBytes;
            if (publicSuffixListBytes == null) {
                e.n("publicSuffixListBytes");
                throw null;
            }
            access$binarySearch = companion.binarySearch(publicSuffixListBytes, array, n);
            if (access$binarySearch != null) {
                break;
            }
            ++n;
        }
        String access$binarySearch2 = null;
        Label_0262: {
            if (size > 1) {
                final byte[][] array2 = array.clone();
                for (int length = array2.length, j = 0; j < length - 1; ++j) {
                    array2[j] = PublicSuffixDatabase.WILDCARD_LABEL;
                    final Companion companion2 = PublicSuffixDatabase.Companion;
                    final byte[] publicSuffixListBytes2 = this.publicSuffixListBytes;
                    if (publicSuffixListBytes2 == null) {
                        e.n("publicSuffixListBytes");
                        throw null;
                    }
                    access$binarySearch2 = companion2.binarySearch(publicSuffixListBytes2, array2, j);
                    if (access$binarySearch2 != null) {
                        break Label_0262;
                    }
                }
            }
            access$binarySearch2 = null;
        }
        String access$binarySearch3 = null;
        Label_0323: {
            if (access$binarySearch2 != null) {
                for (int k = 0; k < size - 1; ++k) {
                    final Companion companion3 = PublicSuffixDatabase.Companion;
                    final byte[] publicSuffixExceptionListBytes = this.publicSuffixExceptionListBytes;
                    if (publicSuffixExceptionListBytes == null) {
                        e.n("publicSuffixExceptionListBytes");
                        throw null;
                    }
                    access$binarySearch3 = companion3.binarySearch(publicSuffixExceptionListBytes, array, k);
                    if (access$binarySearch3 != null) {
                        break Label_0323;
                    }
                }
            }
            access$binarySearch3 = null;
        }
        if (access$binarySearch3 != null) {
            return kotlin.text.b.m1(0, 6, (CharSequence)e.l((Object)access$binarySearch3, "!"), new char[] { '.' });
        }
        if (access$binarySearch == null && access$binarySearch2 == null) {
            return PublicSuffixDatabase.PREVAILING_RULE;
        }
        List m1;
        if (access$binarySearch == null) {
            m1 = null;
        }
        else {
            m1 = kotlin.text.b.m1(0, 6, (CharSequence)access$binarySearch, new char[] { '.' });
        }
        Object instance = m1;
        if (m1 == null) {
            instance = EmptyList.INSTANCE;
        }
        List m2;
        if (access$binarySearch2 == null) {
            m2 = list2;
        }
        else {
            m2 = kotlin.text.b.m1(0, 6, (CharSequence)access$binarySearch2, new char[] { '.' });
        }
        Object instance2 = m2;
        if (m2 == null) {
            instance2 = EmptyList.INSTANCE;
        }
        if (((List)instance).size() <= ((List)instance2).size()) {
            instance = instance2;
        }
        return (List<String>)instance;
    }
    
    private final void readTheList() throws IOException {
        final InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        final b0 b = u.b((g0)new o((g0)u.g(resourceAsStream)));
        try {
            final long n = b.readInt();
            b.c1(n);
            final byte[] y = b.g.y(n);
            final long n2 = b.readInt();
            b.c1(n2);
            final byte[] y2 = b.g.y(n2);
            final j a = j.a;
            lw0.b.X((Closeable)b, (Throwable)null);
            synchronized (this) {
                this.publicSuffixListBytes = y;
                this.publicSuffixExceptionListBytes = y2;
                monitorexit(this);
                this.readCompleteLatch.countDown();
            }
        }
        finally {
            try {}
            finally {
                final Throwable t;
                lw0.b.X((Closeable)b, t);
            }
        }
    }
    
    private final void readTheListUninterruptibly() {
        final boolean b = false;
        try {
            try {
                this.readTheList();
                if (b) {
                    Thread.currentThread().interrupt();
                }
            }
            finally {
                if (b) {
                    Thread.currentThread().interrupt();
                }
                Thread.currentThread().interrupt();
            }
        }
        catch (final IOException ex) {}
        catch (final InterruptedIOException ex2) {}
    }
    
    private final List<String> splitDomain(final String s) {
        List list2;
        final List list = list2 = kotlin.text.b.m1(0, 6, (CharSequence)s, new char[] { 46 });
        if (e.a(CollectionsKt___CollectionsKt.K3(list), (Object)"")) {
            list2 = CollectionsKt___CollectionsKt.v3(list);
        }
        return list2;
    }
    
    public final String getEffectiveTldPlusOne(final String s) {
        e.f((Object)s, "domain");
        final String unicode = IDN.toUnicode(s);
        e.e((Object)unicode, "unicodeDomain");
        final List<String> splitDomain = this.splitDomain(unicode);
        final List<String> matchingRule = this.findMatchingRule(splitDomain);
        if (splitDomain.size() == matchingRule.size() && ((String)matchingRule.get(0)).charAt(0) != '!') {
            return null;
        }
        int n;
        int size;
        if (((String)matchingRule.get(0)).charAt(0) == '!') {
            n = splitDomain.size();
            size = matchingRule.size();
        }
        else {
            n = splitDomain.size();
            size = matchingRule.size() + 1;
        }
        return kotlin.sequences.b.q1(kotlin.sequences.b.h1((k)CollectionsKt___CollectionsKt.q3((Iterable)this.splitDomain(s)), n - size), ".", 62);
    }
    
    public final void setListBytes(final byte[] publicSuffixListBytes, final byte[] publicSuffixExceptionListBytes) {
        e.f((Object)publicSuffixListBytes, "publicSuffixListBytes");
        e.f((Object)publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = publicSuffixListBytes;
        this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
    
    @Metadata(d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014" }, d2 = { "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "()V", "EXCEPTION_MARKER", "", "PREVAILING_RULE", "", "", "PUBLIC_SUFFIX_RESOURCE", "WILDCARD_LABEL", "", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "binarySearch", "labels", "", "labelIndex", "", "([B[[BI)Ljava/lang/String;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        private final String binarySearch(final byte[] array, final byte[][] array2, final int n) {
            int length = array.length;
            int i = 0;
            while (i < length) {
                int n2;
                for (n2 = (i + length) / 2; n2 > -1 && array[n2] != (byte)10; --n2) {}
                final int n3 = n2 + 1;
                int n4 = 1;
                int n5;
                while (true) {
                    n5 = n3 + n4;
                    if (array[n5] == (byte)10) {
                        break;
                    }
                    ++n4;
                }
                final int n6 = n5 - n3;
                int n7 = n;
                int n8 = 0;
                int n9 = 0;
                int n10 = 0;
                int n11;
                while (true) {
                    int and;
                    if (n8 != 0) {
                        and = 46;
                        n8 = 0;
                    }
                    else {
                        and = _UtilCommonKt.and(array2[n7][n9], 255);
                    }
                    n11 = and - _UtilCommonKt.and(array[n3 + n10], 255);
                    if (n11 != 0) {
                        break;
                    }
                    ++n10;
                    ++n9;
                    if (n10 == n6) {
                        break;
                    }
                    if (array2[n7].length != n9) {
                        continue;
                    }
                    if (n7 == array2.length - 1) {
                        break;
                    }
                    ++n7;
                    n9 = -1;
                    n8 = 1;
                }
                Label_0192: {
                    if (n11 >= 0) {
                        if (n11 <= 0) {
                            final int n12 = n6 - n10;
                            int n13 = array2[n7].length - n9;
                            for (int j = n7 + 1; j < array2.length; ++j) {
                                n13 += array2[j].length;
                            }
                            if (n13 < n12) {
                                break Label_0192;
                            }
                            if (n13 <= n12) {
                                return new String(array, n3, n6, cj2.a.b);
                            }
                        }
                        i = n5 + 1;
                        continue;
                    }
                }
                length = n3 - 1;
            }
            return null;
        }
        
        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.access$getInstance$cp();
        }
    }
}
