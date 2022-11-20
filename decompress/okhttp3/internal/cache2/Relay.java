// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.cache2;

import java.io.File;
import java.io.Closeable;
import okhttp3.internal._UtilCommonKt;
import cg2.j;
import java.io.IOException;
import java.nio.channels.FileChannel;
import ng2.e;
import okio.ByteString$a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import fk2.g0;
import java.io.RandomAccessFile;
import fk2.c;
import okio.ByteString;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 C2\u00020\u0001:\u0002CDB5\b\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u00103\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\bA\u0010BJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0002J\b\u0010\r\u001a\u0004\u0018\u00010\fR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00103\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0017\u0010:\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010>\u001a\u0002098\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u0011\u0010@\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b@\u0010)¨\u0006E" }, d2 = { "Lokhttp3/internal/cache2/Relay;", "", "Lokio/ByteString;", "prefix", "", "upstreamSize", "metadataSize", "Lcg2/j;", "writeHeader", "writeMetadata", "commit", "metadata", "Lfk2/g0;", "newSource", "Ljava/io/RandomAccessFile;", "file", "Ljava/io/RandomAccessFile;", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "upstreamPos", "J", "getUpstreamPos", "()J", "setUpstreamPos", "(J)V", "Lokio/ByteString;", "bufferMaxSize", "getBufferMaxSize", "Ljava/lang/Thread;", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "", "complete", "Z", "getComplete", "()Z", "setComplete", "(Z)V", "", "sourceCount", "I", "getSourceCount", "()I", "setSourceCount", "(I)V", "upstream", "Lfk2/g0;", "getUpstream", "()Lfk2/g0;", "setUpstream", "(Lfk2/g0;)V", "Lfk2/c;", "upstreamBuffer", "Lfk2/c;", "getUpstreamBuffer", "()Lfk2/c;", "buffer", "getBuffer", "isClosed", "<init>", "(Ljava/io/RandomAccessFile;Lfk2/g0;JLokio/ByteString;J)V", "Companion", "RelaySource", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class Relay
{
    public static final Companion Companion;
    private static final long FILE_HEADER_SIZE = 32L;
    public static final ByteString PREFIX_CLEAN;
    public static final ByteString PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final c buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final ByteString metadata;
    private int sourceCount;
    private g0 upstream;
    private final c upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;
    
    static {
        Companion = new Companion(null);
        ByteString.Companion.getClass();
        PREFIX_CLEAN = ByteString$a.c("OkHttp cache v1\n");
        PREFIX_DIRTY = ByteString$a.c("OkHttp DIRTY :(\n");
    }
    
    private Relay(final RandomAccessFile file, final g0 upstream, final long upstreamPos, final ByteString metadata, final long bufferMaxSize) {
        this.file = file;
        this.upstream = upstream;
        this.upstreamPos = upstreamPos;
        this.metadata = metadata;
        this.bufferMaxSize = bufferMaxSize;
        this.upstreamBuffer = new c();
        this.complete = (this.upstream == null);
        this.buffer = new c();
    }
    
    public Relay(final RandomAccessFile randomAccessFile, final g0 g0, final long n, final ByteString byteString, final long n2, final DefaultConstructorMarker defaultConstructorMarker) {
        this(randomAccessFile, g0, n, byteString, n2);
    }
    
    public static final void access$writeHeader(final Relay relay, final ByteString byteString, final long n, final long n2) {
        relay.writeHeader(byteString, n, n2);
    }
    
    private final void writeHeader(final ByteString byteString, final long n, final long n2) throws IOException {
        final c c = new c();
        c.R(byteString);
        c.W(n);
        c.W(n2);
        if (c.g == 32L) {
            final RandomAccessFile file = this.file;
            e.c((Object)file);
            final FileChannel channel = file.getChannel();
            e.e((Object)channel, "file!!.channel");
            new FileOperator(channel).write(0L, c, 32L);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    private final void writeMetadata(final long n) throws IOException {
        final c c = new c();
        c.R(this.metadata);
        final RandomAccessFile file = this.file;
        e.c((Object)file);
        final FileChannel channel = file.getChannel();
        e.e((Object)channel, "file!!.channel");
        new FileOperator(channel).write(32L + n, c, this.metadata.size());
    }
    
    public final void commit(final long n) throws IOException {
        this.writeMetadata(n);
        final RandomAccessFile file = this.file;
        e.c((Object)file);
        file.getChannel().force(false);
        this.writeHeader(Relay.PREFIX_CLEAN, n, this.metadata.size());
        final RandomAccessFile file2 = this.file;
        e.c((Object)file2);
        file2.getChannel().force(false);
        synchronized (this) {
            this.setComplete(true);
            final j a = j.a;
            monitorexit(this);
            final g0 upstream = this.upstream;
            if (upstream != null) {
                _UtilCommonKt.closeQuietly(upstream);
            }
            this.upstream = null;
        }
    }
    
    public final c getBuffer() {
        return this.buffer;
    }
    
    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }
    
    public final boolean getComplete() {
        return this.complete;
    }
    
    public final RandomAccessFile getFile() {
        return this.file;
    }
    
    public final int getSourceCount() {
        return this.sourceCount;
    }
    
    public final g0 getUpstream() {
        return this.upstream;
    }
    
    public final c getUpstreamBuffer() {
        return this.upstreamBuffer;
    }
    
    public final long getUpstreamPos() {
        return this.upstreamPos;
    }
    
    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }
    
    public final boolean isClosed() {
        return this.file == null;
    }
    
    public final ByteString metadata() {
        return this.metadata;
    }
    
    public final g0 newSource() {
        synchronized (this) {
            if (this.getFile() == null) {
                return null;
            }
            this.setSourceCount(this.getSourceCount() + 1);
            monitorexit(this);
            return (g0)new Relay.Relay$RelaySource(this);
        }
    }
    
    public final void setComplete(final boolean complete) {
        this.complete = complete;
    }
    
    public final void setFile(final RandomAccessFile file) {
        this.file = file;
    }
    
    public final void setSourceCount(final int sourceCount) {
        this.sourceCount = sourceCount;
    }
    
    public final void setUpstream(final g0 upstream) {
        this.upstream = upstream;
    }
    
    public final void setUpstreamPos(final long upstreamPos) {
        this.upstreamPos = upstreamPos;
    }
    
    public final void setUpstreamReader(final Thread upstreamReader) {
        this.upstreamReader = upstreamReader;
    }
    
    @Metadata(bv = {}, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0018" }, d2 = { "Lokhttp3/internal/cache2/Relay$Companion;", "", "Ljava/io/File;", "file", "Lfk2/g0;", "upstream", "Lokio/ByteString;", "metadata", "", "bufferMaxSize", "Lokhttp3/internal/cache2/Relay;", "edit", "read", "FILE_HEADER_SIZE", "J", "PREFIX_CLEAN", "Lokio/ByteString;", "PREFIX_DIRTY", "", "SOURCE_FILE", "I", "SOURCE_UPSTREAM", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final Relay edit(final File file, final g0 g0, final ByteString byteString, final long n) throws IOException {
            e.f((Object)file, "file");
            e.f((Object)g0, "upstream");
            e.f((Object)byteString, "metadata");
            final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            final Relay relay = new Relay(randomAccessFile, g0, 0L, byteString, n, null);
            randomAccessFile.setLength(0L);
            Relay.access$writeHeader(relay, Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }
        
        public final Relay read(final File file) throws IOException {
            e.f((Object)file, "file");
            final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            final FileChannel channel = randomAccessFile.getChannel();
            e.e((Object)channel, "randomAccessFile.channel");
            final FileOperator fileOperator = new FileOperator(channel);
            final c c = new c();
            fileOperator.read(0L, c, 32L);
            final ByteString prefix_CLEAN = Relay.PREFIX_CLEAN;
            if (e.a((Object)c.U0((long)prefix_CLEAN.size()), (Object)prefix_CLEAN)) {
                final long long1 = c.readLong();
                final long long2 = c.readLong();
                final c c2 = new c();
                fileOperator.read(long1 + 32L, c2, long2);
                return new Relay(randomAccessFile, null, long1, c2.D1(), 0L, null);
            }
            throw new IOException("unreadable cache file");
        }
    }
}
