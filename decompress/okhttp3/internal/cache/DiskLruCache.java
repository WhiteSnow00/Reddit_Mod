// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.cache;

import kotlin.KotlinNothingValueException;
import java.util.ArrayList;
import fk2.g0;
import fk2.a0;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.concurrent.Task;
import java.util.Collection;
import java.util.List;
import kotlin.text.b;
import fk2.b0;
import xd.a;
import java.io.EOFException;
import java.util.Iterator;
import okhttp3.internal._UtilCommonKt;
import java.io.FileNotFoundException;
import fk2.e0;
import fk2.u;
import mg2.l;
import java.io.IOException;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.LinkedHashMap;
import fk2.e;
import fk2.j;
import fk2.y;
import okhttp3.internal.concurrent.TaskQueue;
import kotlin.text.Regex;
import kotlin.Metadata;
import java.io.Flushable;
import java.io.Closeable;

@Metadata(bv = {}, d1 = { "\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u0001R\u0018\u0000 c2\u00020\u00012\u00020\u0002:\u0004cdefB7\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u00020\f\u0012\u0006\u0010`\u001a\u00020_¢\u0006\u0004\ba\u0010bJ\u0006\u0010\u0004\u001a\u00020\u0003J\u000f\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\b\u0018\u00010\nR\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0086\u0002J \u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\u0006\u0010\u0010\u001a\u00020\fJ#\u0010\u0016\u001a\u00020\u00032\n\u0010\u0011\u001a\u00060\u000eR\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bJ\u001b\u0010\u001c\u001a\u00020\u00122\n\u0010\u0019\u001a\u00060\u0018R\u00020\u0000H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001d\u001a\u00020\u0003H\u0016J\u0006\u0010\u001e\u001a\u00020\u0012J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0006\u0010 \u001a\u00020\u0003J\u0006\u0010!\u001a\u00020\u0003J\u0006\u0010\"\u001a\u00020\u0003J\u0010\u0010$\u001a\f\u0012\b\u0012\u00060\nR\u00020\u00000#J\b\u0010%\u001a\u00020\u0003H\u0002J\b\u0010'\u001a\u00020&H\u0002J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\bH\u0002J\b\u0010*\u001a\u00020\u0003H\u0002J\b\u0010+\u001a\u00020\u0012H\u0002J\b\u0010,\u001a\u00020\u0003H\u0002J\b\u0010-\u001a\u00020\u0012H\u0002J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00102\u001a\u00020/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\b3\u00104R*\u00106\u001a\u00020\f2\u0006\u00105\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00107R>\u0010>\u001a&\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\u0018R\u00020\u00000<j\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\u0018R\u00020\u0000`=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00101R\u0016\u0010C\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0016\u0010F\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010DR\"\u0010G\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010D\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010DR\u0016\u0010M\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010DR\u0016\u0010N\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u00107R\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0017\u0010V\u001a\u00020U8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010[\u001a\u00020Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^¨\u0006g" }, d2 = { "Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lcg2/j;", "initialize", "rebuildJournal$okhttp", "()V", "rebuildJournal", "", "key", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "", "expectedSequenceNumber", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "edit", "size", "editor", "", "success", "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "completeEdit", "remove", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "removeEntry", "flush", "isClosed", "close", "trimToSize", "delete", "evictAll", "", "snapshots", "readJournal", "Lfk2/e;", "newJournalWriter", "line", "readJournalLine", "processJournal", "journalRebuildRequired", "checkNotClosed", "removeOldestEntry", "validateKey", "", "appVersion", "I", "valueCount", "getValueCount$okhttp", "()I", "value", "maxSize", "J", "getMaxSize", "()J", "setMaxSize", "(J)V", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "lruEntries", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "redundantOpCount", "hasJournalErrors", "Z", "civilizedFileSystem", "initialized", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "mostRecentTrimFailed", "mostRecentRebuildFailed", "nextSequenceNumber", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "Lfk2/y;", "directory", "Lfk2/y;", "getDirectory", "()Lfk2/y;", "Lfk2/j;", "fileSystem", "Lfk2/j;", "getFileSystem$okhttp", "()Lfk2/j;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lfk2/j;Lfk2/y;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "Companion", "Editor", "Entry", "Snapshot", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class DiskLruCache implements Closeable, Flushable
{
    public static final long ANY_SEQUENCE_NUMBER;
    public static final String CLEAN;
    public static final Companion Companion;
    public static final String DIRTY;
    public static final String JOURNAL_FILE;
    public static final String JOURNAL_FILE_BACKUP;
    public static final String JOURNAL_FILE_TEMP;
    public static final Regex LEGAL_KEY_PATTERN;
    public static final String MAGIC;
    public static final String READ;
    public static final String REMOVE;
    public static final String VERSION_1;
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final y directory;
    private final j fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final y journalFile;
    private final y journalFileBackup;
    private final y journalFileTmp;
    private e journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    
    static {
        Companion = new Companion(null);
        JOURNAL_FILE = "journal";
        JOURNAL_FILE_TEMP = "journal.tmp";
        JOURNAL_FILE_BACKUP = "journal.bkp";
        MAGIC = "libcore.io.DiskLruCache";
        VERSION_1 = "1";
        ANY_SEQUENCE_NUMBER = -1L;
        LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");
        CLEAN = "CLEAN";
        DIRTY = "DIRTY";
        REMOVE = "REMOVE";
        READ = "READ";
    }
    
    public DiskLruCache(final j j, final y directory, int appVersion, final int valueCount, final long maxSize, final TaskRunner taskRunner) {
        ng2.e.f((Object)j, "fileSystem");
        ng2.e.f((Object)directory, "directory");
        ng2.e.f((Object)taskRunner, "taskRunner");
        this.directory = directory;
        this.appVersion = appVersion;
        this.valueCount = valueCount;
        this.fileSystem = (j)new DiskLruCache$fileSystem.DiskLruCache$fileSystem$1(j);
        this.maxSize = maxSize;
        final int n = 0;
        this.lruEntries = new LinkedHashMap<String, Entry>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        this.cleanupTask = new DiskLruCache$cleanupTask$1(this, ng2.e.l((Object)" Cache", _UtilJvmKt.okHttpName));
        if (maxSize > 0L) {
            appVersion = 1;
        }
        else {
            appVersion = 0;
        }
        if (appVersion == 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        appVersion = n;
        if (valueCount > 0) {
            appVersion = 1;
        }
        if (appVersion != 0) {
            this.journalFile = directory.d(DiskLruCache.JOURNAL_FILE);
            this.journalFileTmp = directory.d(DiskLruCache.JOURNAL_FILE_TEMP);
            this.journalFileBackup = directory.d(DiskLruCache.JOURNAL_FILE_BACKUP);
            return;
        }
        throw new IllegalArgumentException("valueCount <= 0".toString());
    }
    
    public static final boolean access$getCivilizedFileSystem$p(final DiskLruCache diskLruCache) {
        return diskLruCache.civilizedFileSystem;
    }
    
    public static final boolean access$getInitialized$p(final DiskLruCache diskLruCache) {
        return diskLruCache.initialized;
    }
    
    public static final boolean access$journalRebuildRequired(final DiskLruCache diskLruCache) {
        return diskLruCache.journalRebuildRequired();
    }
    
    public static final void access$setHasJournalErrors$p(final DiskLruCache diskLruCache, final boolean hasJournalErrors) {
        diskLruCache.hasJournalErrors = hasJournalErrors;
    }
    
    public static final void access$setJournalWriter$p(final DiskLruCache diskLruCache, final e journalWriter) {
        diskLruCache.journalWriter = journalWriter;
    }
    
    public static final void access$setMostRecentRebuildFailed$p(final DiskLruCache diskLruCache, final boolean mostRecentRebuildFailed) {
        diskLruCache.mostRecentRebuildFailed = mostRecentRebuildFailed;
    }
    
    public static final void access$setMostRecentTrimFailed$p(final DiskLruCache diskLruCache, final boolean mostRecentTrimFailed) {
        diskLruCache.mostRecentTrimFailed = mostRecentTrimFailed;
    }
    
    public static final void access$setRedundantOpCount$p(final DiskLruCache diskLruCache, final int redundantOpCount) {
        diskLruCache.redundantOpCount = redundantOpCount;
    }
    
    private final void checkNotClosed() {
        synchronized (this) {
            if (this.closed ^ true) {
                return;
            }
            throw new IllegalStateException("cache is closed".toString());
        }
    }
    
    public static Editor edit$default(final DiskLruCache diskLruCache, final String s, long any_SEQUENCE_NUMBER, final int n, final Object o) throws IOException {
        if ((n & 0x2) != 0x0) {
            any_SEQUENCE_NUMBER = DiskLruCache.ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(s, any_SEQUENCE_NUMBER);
    }
    
    private final boolean journalRebuildRequired() {
        final int redundantOpCount = this.redundantOpCount;
        return redundantOpCount >= 2000 && redundantOpCount >= this.lruEntries.size();
    }
    
    private final e newJournalWriter() throws FileNotFoundException {
        return (e)u.a((e0)new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), (l<? super IOException, cg2.j>)new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }
    
    private final void processJournal() throws IOException {
        _UtilCommonKt.deleteIfExists(this.fileSystem, this.journalFileTmp);
        final Iterator<Entry> iterator = this.lruEntries.values().iterator();
        while (iterator.hasNext()) {
            final Entry next = iterator.next();
            ng2.e.e((Object)next, "i.next()");
            final Entry entry = next;
            final Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
            final int n = 0;
            int i = 0;
            if (currentEditor$okhttp == null) {
                while (i < this.valueCount) {
                    this.size += entry.getLengths$okhttp()[i];
                    ++i;
                }
            }
            else {
                entry.setCurrentEditor$okhttp(null);
                for (int valueCount = this.valueCount, j = n; j < valueCount; ++j) {
                    _UtilCommonKt.deleteIfExists(this.fileSystem, entry.getCleanFiles$okhttp().get(j));
                    _UtilCommonKt.deleteIfExists(this.fileSystem, entry.getDirtyFiles$okhttp().get(j));
                }
                iterator.remove();
            }
        }
    }
    
    private final void readJournal() throws IOException {
        final b0 b = u.b(this.fileSystem.source(this.journalFile));
        Object o = null;
        Throwable t = null;
        Label_0287: {
            try {
                final String b2 = b.b1();
                final String b3 = b.b1();
                final String b4 = b.b1();
                final String b5 = b.b1();
                final String b6 = b.b1();
                if (ng2.e.a((Object)DiskLruCache.MAGIC, (Object)b2) && ng2.e.a((Object)DiskLruCache.VERSION_1, (Object)b3) && ng2.e.a((Object)String.valueOf(this.appVersion), (Object)b4) && ng2.e.a((Object)String.valueOf(this.getValueCount$okhttp()), (Object)b5)) {
                    final int length = b6.length();
                    final int n = 0;
                    if (length <= 0) {
                        int n2 = n;
                        try {
                            while (true) {
                                this.readJournalLine(b.b1());
                                ++n2;
                            }
                        }
                        catch (final EOFException ex) {
                            this.redundantOpCount = n2 - this.getLruEntries$okhttp().size();
                            if (!b.e1()) {
                                this.rebuildJournal$okhttp();
                            }
                            else {
                                this.journalWriter = this.newJournalWriter();
                            }
                            final cg2.j a = cg2.j.a;
                            break Label_0287;
                        }
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("unexpected journal header: [");
                sb.append(b2);
                sb.append(", ");
                sb.append(b3);
                sb.append(", ");
                sb.append(b5);
                sb.append(", ");
                sb.append(b6);
                sb.append(']');
                throw new IOException(sb.toString());
            }
            finally {
                o = null;
            }
            try {
                b.close();
            }
            finally {
                if (t == null) {
                    final Throwable t2;
                    t = t2;
                }
                else {
                    final Throwable t2;
                    a.t(t, t2);
                }
            }
        }
        if (t == null) {
            ng2.e.c(o);
        }
    }
    
    private final void readJournalLine(String substring) throws IOException {
        final int s0 = b.S0((CharSequence)substring, ' ', 0, false, 6);
        if (s0 != -1) {
            final int n = s0 + 1;
            final int s2 = b.S0((CharSequence)substring, ' ', n, false, 4);
            String substring3;
            if (s2 == -1) {
                final String substring2 = substring.substring(n);
                ng2.e.e((Object)substring2, "this as java.lang.String).substring(startIndex)");
                final String remove = DiskLruCache.REMOVE;
                substring3 = substring2;
                if (s0 == remove.length()) {
                    substring3 = substring2;
                    if (xi2.j.I0(substring, remove, false)) {
                        this.lruEntries.remove(substring2);
                        return;
                    }
                }
            }
            else {
                substring3 = substring.substring(n, s2);
                ng2.e.e((Object)substring3, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            }
            Entry entry;
            if ((entry = this.lruEntries.get(substring3)) == null) {
                entry = new Entry(substring3);
                this.lruEntries.put(substring3, entry);
            }
            if (s2 != -1) {
                final String clean = DiskLruCache.CLEAN;
                if (s0 == clean.length() && xi2.j.I0(substring, clean, false)) {
                    substring = substring.substring(s2 + 1);
                    ng2.e.e((Object)substring, "this as java.lang.String).substring(startIndex)");
                    final List g1 = b.g1(0, 6, (CharSequence)substring, new char[] { ' ' });
                    entry.setReadable$okhttp(true);
                    entry.setCurrentEditor$okhttp(null);
                    entry.setLengths$okhttp(g1);
                    return;
                }
            }
            if (s2 == -1) {
                final String dirty = DiskLruCache.DIRTY;
                if (s0 == dirty.length() && xi2.j.I0(substring, dirty, false)) {
                    entry.setCurrentEditor$okhttp(new Editor(entry));
                    return;
                }
            }
            if (s2 == -1) {
                final String read = DiskLruCache.READ;
                if (s0 == read.length() && xi2.j.I0(substring, read, false)) {
                    return;
                }
            }
            throw new IOException(ng2.e.l((Object)substring, "unexpected journal line: "));
        }
        throw new IOException(ng2.e.l((Object)substring, "unexpected journal line: "));
    }
    
    private final boolean removeOldestEntry() {
        for (final Entry entry : this.lruEntries.values()) {
            if (!entry.getZombie$okhttp()) {
                this.removeEntry$okhttp(entry);
                return true;
            }
        }
        return false;
    }
    
    private final void validateKey(final String s) {
        if (DiskLruCache.LEGAL_KEY_PATTERN.matches(s)) {
            return;
        }
        throw new IllegalArgumentException(aq2.a.m("keys must match regex [a-z0-9_-]{1,120}: \"", s, '\"').toString());
    }
    
    @Override
    public void close() throws IOException {
        synchronized (this) {
            if (!this.initialized || this.closed) {
                this.closed = true;
                return;
            }
            final Collection<Entry> values = this.lruEntries.values();
            ng2.e.e((Object)values, "lruEntries.values");
            int i = 0;
            final Entry[] array = values.toArray(new Entry[0]);
            if (array != null) {
                int n;
                for (Entry[] array2 = array; i < array2.length; i = n) {
                    final Entry entry = array2[i];
                    n = ++i;
                    if (entry.getCurrentEditor$okhttp() != null) {
                        final Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
                        if (currentEditor$okhttp != null) {
                            currentEditor$okhttp.detach$okhttp();
                        }
                    }
                }
                this.trimToSize();
                final e journalWriter = this.journalWriter;
                ng2.e.c((Object)journalWriter);
                ((e0)journalWriter).close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
    
    public final void completeEdit$okhttp(final Editor editor, final boolean b) throws IOException {
        synchronized (this) {
            ng2.e.f((Object)editor, "editor");
            final Entry entry$okhttp = editor.getEntry$okhttp();
            if (!ng2.e.a((Object)entry$okhttp.getCurrentEditor$okhttp(), (Object)editor)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            final int n = 0;
            if (b && !entry$okhttp.getReadable$okhttp()) {
                for (int valueCount = this.valueCount, i = 0; i < valueCount; ++i) {
                    final boolean[] written$okhttp = editor.getWritten$okhttp();
                    ng2.e.c((Object)written$okhttp);
                    if (!written$okhttp[i]) {
                        editor.abort();
                        throw new IllegalStateException(ng2.e.l((Object)i, "Newly created entry didn't create value for index "));
                    }
                    if (!this.fileSystem.exists(entry$okhttp.getDirtyFiles$okhttp().get(i))) {
                        editor.abort();
                        return;
                    }
                }
            }
            for (int valueCount2 = this.valueCount, j = n; j < valueCount2; ++j) {
                final y y = entry$okhttp.getDirtyFiles$okhttp().get(j);
                if (b && !entry$okhttp.getZombie$okhttp()) {
                    if (this.fileSystem.exists(y)) {
                        final y y2 = entry$okhttp.getCleanFiles$okhttp().get(j);
                        this.fileSystem.atomicMove(y, y2);
                        final long n2 = entry$okhttp.getLengths$okhttp()[j];
                        final Long d = this.fileSystem.metadata(y2).d;
                        long longValue;
                        if (d == null) {
                            longValue = 0L;
                        }
                        else {
                            longValue = d;
                        }
                        entry$okhttp.getLengths$okhttp()[j] = longValue;
                        this.size = this.size - n2 + longValue;
                    }
                }
                else {
                    _UtilCommonKt.deleteIfExists(this.fileSystem, y);
                }
            }
            entry$okhttp.setCurrentEditor$okhttp(null);
            if (entry$okhttp.getZombie$okhttp()) {
                this.removeEntry$okhttp(entry$okhttp);
                return;
            }
            ++this.redundantOpCount;
            final e journalWriter = this.journalWriter;
            ng2.e.c((Object)journalWriter);
            if (!entry$okhttp.getReadable$okhttp() && !b) {
                this.getLruEntries$okhttp().remove(entry$okhttp.getKey$okhttp());
                journalWriter.a1(DiskLruCache.REMOVE).writeByte(32);
                journalWriter.a1(entry$okhttp.getKey$okhttp());
                journalWriter.writeByte(10);
            }
            else {
                entry$okhttp.setReadable$okhttp(true);
                journalWriter.a1(DiskLruCache.CLEAN).writeByte(32);
                journalWriter.a1(entry$okhttp.getKey$okhttp());
                entry$okhttp.writeLengths$okhttp(journalWriter);
                journalWriter.writeByte(10);
                if (b) {
                    final long nextSequenceNumber = this.nextSequenceNumber;
                    this.nextSequenceNumber = 1L + nextSequenceNumber;
                    entry$okhttp.setSequenceNumber$okhttp(nextSequenceNumber);
                }
            }
            journalWriter.flush();
            if (this.size > this.maxSize || this.journalRebuildRequired()) {
                TaskQueue.schedule$default(this.cleanupQueue, (Task)this.cleanupTask, 0L, 2, null);
            }
        }
    }
    
    public final void delete() throws IOException {
        this.close();
        _UtilCommonKt.deleteContents(this.fileSystem, this.directory);
    }
    
    public final Editor edit(final String s) throws IOException {
        ng2.e.f((Object)s, "key");
        return edit$default(this, s, 0L, 2, null);
    }
    
    public final Editor edit(final String s, final long n) throws IOException {
        synchronized (this) {
            ng2.e.f((Object)s, "key");
            this.initialize();
            this.checkNotClosed();
            this.validateKey(s);
            final Entry entry = this.lruEntries.get(s);
            if (n != DiskLruCache.ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber$okhttp() != n)) {
                return null;
            }
            Editor currentEditor$okhttp;
            if (entry == null) {
                currentEditor$okhttp = null;
            }
            else {
                currentEditor$okhttp = entry.getCurrentEditor$okhttp();
            }
            if (currentEditor$okhttp != null) {
                return null;
            }
            if (entry != null && entry.getLockingSourceCount$okhttp() != 0) {
                return null;
            }
            if (this.mostRecentTrimFailed || this.mostRecentRebuildFailed) {
                TaskQueue.schedule$default(this.cleanupQueue, (Task)this.cleanupTask, 0L, 2, null);
                return null;
            }
            final e journalWriter = this.journalWriter;
            ng2.e.c((Object)journalWriter);
            journalWriter.a1(DiskLruCache.DIRTY).writeByte(32).a1(s).writeByte(10);
            journalWriter.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            Entry entry2;
            if ((entry2 = entry) == null) {
                entry2 = new Entry(s);
                this.lruEntries.put(s, entry2);
            }
            final Editor currentEditor$okhttp2 = new Editor(entry2);
            entry2.setCurrentEditor$okhttp(currentEditor$okhttp2);
            return currentEditor$okhttp2;
        }
    }
    
    public final void evictAll() throws IOException {
        synchronized (this) {
            this.initialize();
            final Collection<Entry> values = this.lruEntries.values();
            ng2.e.e((Object)values, "lruEntries.values");
            final Entry[] array = values.toArray(new Entry[0]);
            if (array != null) {
                final Entry[] array2 = array;
                final int length = array2.length;
                int i = 0;
                while (i < length) {
                    final Entry entry = array2[i];
                    ++i;
                    ng2.e.e((Object)entry, "entry");
                    this.removeEntry$okhttp(entry);
                }
                this.mostRecentTrimFailed = false;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
    
    @Override
    public void flush() throws IOException {
        synchronized (this) {
            if (!this.initialized) {
                return;
            }
            this.checkNotClosed();
            this.trimToSize();
            final e journalWriter = this.journalWriter;
            ng2.e.c((Object)journalWriter);
            journalWriter.flush();
        }
    }
    
    public final Snapshot get(final String s) throws IOException {
        synchronized (this) {
            ng2.e.f((Object)s, "key");
            this.initialize();
            this.checkNotClosed();
            this.validateKey(s);
            final Entry entry = this.lruEntries.get(s);
            if (entry == null) {
                return null;
            }
            final Snapshot snapshot$okhttp = entry.snapshot$okhttp();
            if (snapshot$okhttp == null) {
                return null;
            }
            ++this.redundantOpCount;
            final e journalWriter = this.journalWriter;
            ng2.e.c((Object)journalWriter);
            journalWriter.a1(DiskLruCache.READ).writeByte(32).a1(s).writeByte(10);
            if (this.journalRebuildRequired()) {
                TaskQueue.schedule$default(this.cleanupQueue, (Task)this.cleanupTask, 0L, 2, null);
            }
            return snapshot$okhttp;
        }
    }
    
    public final boolean getClosed$okhttp() {
        return this.closed;
    }
    
    public final y getDirectory() {
        return this.directory;
    }
    
    public final j getFileSystem$okhttp() {
        return this.fileSystem;
    }
    
    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }
    
    public final long getMaxSize() {
        synchronized (this) {
            return this.maxSize;
        }
    }
    
    public final int getValueCount$okhttp() {
        return this.valueCount;
    }
    
    public final void initialize() throws IOException {
        synchronized (this) {
            if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                sb.append((Object)Thread.currentThread().getName());
                sb.append(" MUST hold lock on ");
                sb.append(this);
                throw new AssertionError((Object)sb.toString());
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                }
                else {
                    this.fileSystem.atomicMove(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = _UtilCommonKt.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    this.readJournal();
                    this.processJournal();
                    this.initialized = true;
                    return;
                }
                catch (final IOException ex) {
                    final Platform value = Platform.Companion.get();
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("DiskLruCache ");
                    sb2.append(this.directory);
                    sb2.append(" is corrupt: ");
                    sb2.append((Object)ex.getMessage());
                    sb2.append(", removing");
                    value.log(sb2.toString(), 5, (Throwable)ex);
                    try {
                        this.delete();
                    }
                    finally {
                        this.closed = false;
                    }
                }
            }
            this.rebuildJournal$okhttp();
            this.initialized = true;
        }
    }
    
    public final boolean isClosed() {
        synchronized (this) {
            return this.closed;
        }
    }
    
    public final void rebuildJournal$okhttp() throws IOException {
        synchronized (this) {
            try (final e journalWriter = this.journalWriter) {}
            final a0 a = u.a(this.fileSystem.sink(this.journalFileTmp, false));
            Object o = null;
            try {
                a.a1(DiskLruCache.MAGIC);
                a.writeByte(10);
                a.a1(DiskLruCache.VERSION_1);
                a.writeByte(10);
                a.t1((long)this.appVersion);
                a.writeByte(10);
                a.t1((long)this.getValueCount$okhttp());
                a.writeByte(10);
                a.writeByte(10);
                for (final Entry entry : this.getLruEntries$okhttp().values()) {
                    if (entry.getCurrentEditor$okhttp() != null) {
                        a.a1(DiskLruCache.DIRTY);
                        a.writeByte(32);
                        a.a1(entry.getKey$okhttp());
                        a.writeByte(10);
                    }
                    else {
                        a.a1(DiskLruCache.CLEAN);
                        a.writeByte(32);
                        a.a1(entry.getKey$okhttp());
                        entry.writeLengths$okhttp((e)a);
                        a.writeByte(10);
                    }
                }
                final cg2.j a2 = cg2.j.a;
            }
            finally {
                o = null;
            }
            Throwable t = null;
            try {
                a.close();
            }
            finally {
                if (t == null) {
                    final Throwable t2;
                    t = t2;
                }
                else {
                    final Throwable t2;
                    xd.a.t(t, t2);
                }
            }
            if (t == null) {
                ng2.e.c(o);
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.atomicMove(this.journalFile, this.journalFileBackup);
                    this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
                    _UtilCommonKt.deleteIfExists(this.fileSystem, this.journalFileBackup);
                }
                else {
                    this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
                }
                this.journalWriter = this.newJournalWriter();
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
            }
        }
    }
    
    public final boolean remove(final String s) throws IOException {
        synchronized (this) {
            ng2.e.f((Object)s, "key");
            this.initialize();
            this.checkNotClosed();
            this.validateKey(s);
            final Entry entry = this.lruEntries.get(s);
            if (entry == null) {
                return false;
            }
            final boolean removeEntry$okhttp = this.removeEntry$okhttp(entry);
            if (removeEntry$okhttp && this.size <= this.maxSize) {
                this.mostRecentTrimFailed = false;
            }
            return removeEntry$okhttp;
        }
    }
    
    public final boolean removeEntry$okhttp(final Entry entry) throws IOException {
        ng2.e.f((Object)entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0) {
                final e journalWriter = this.journalWriter;
                if (journalWriter != null) {
                    journalWriter.a1(DiskLruCache.DIRTY);
                    journalWriter.writeByte(32);
                    journalWriter.a1(entry.getKey$okhttp());
                    journalWriter.writeByte(10);
                    journalWriter.flush();
                }
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        final Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        for (int i = 0; i < this.valueCount; ++i) {
            _UtilCommonKt.deleteIfExists(this.fileSystem, entry.getCleanFiles$okhttp().get(i));
            this.size -= entry.getLengths$okhttp()[i];
            entry.getLengths$okhttp()[i] = 0L;
        }
        ++this.redundantOpCount;
        final e journalWriter2 = this.journalWriter;
        if (journalWriter2 != null) {
            journalWriter2.a1(DiskLruCache.REMOVE);
            journalWriter2.writeByte(32);
            journalWriter2.a1(entry.getKey$okhttp());
            journalWriter2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (this.journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, (Task)this.cleanupTask, 0L, 2, null);
        }
        return true;
    }
    
    public final void setClosed$okhttp(final boolean closed) {
        this.closed = closed;
    }
    
    public final void setMaxSize(final long maxSize) {
        synchronized (this) {
            this.maxSize = maxSize;
            if (this.initialized) {
                TaskQueue.schedule$default(this.cleanupQueue, (Task)this.cleanupTask, 0L, 2, null);
            }
        }
    }
    
    public final long size() throws IOException {
        synchronized (this) {
            this.initialize();
            return this.size;
        }
    }
    
    public final Iterator<Snapshot> snapshots() throws IOException {
        synchronized (this) {
            this.initialize();
            return (Iterator<Snapshot>)new DiskLruCache$snapshots$1(this);
        }
    }
    
    public final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            if (!this.removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }
    
    @Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000¨\u0006\u0011" }, d2 = { "Lokhttp3/internal/cache/DiskLruCache$Companion;", "", "()V", "ANY_SEQUENCE_NUMBER", "", "CLEAN", "", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "MAGIC", "READ", "REMOVE", "VERSION_1", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0010\u001a\u00060\u000eR\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002R\u001e\u0010\u0010\u001a\u00060\u000eR\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e" }, d2 = { "Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "Lcg2/j;", "detach$okhttp", "()V", "detach", "", "index", "Lfk2/g0;", "newSource", "Lfk2/e0;", "newSink", "commit", "abort", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "entry", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "written", "[Z", "getWritten$okhttp", "()[Z", "", "done", "Z", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public final class Editor
    {
        private boolean done;
        private final Entry entry;
        public final DiskLruCache this$0;
        private final boolean[] written;
        
        public Editor(final DiskLruCache this$0, final Entry entry) {
            ng2.e.f((Object)this$0, "this$0");
            ng2.e.f((Object)entry, "entry");
            this.this$0 = this$0;
            this.entry = entry;
            boolean[] written;
            if (entry.getReadable$okhttp()) {
                written = null;
            }
            else {
                written = new boolean[this$0.getValueCount$okhttp()];
            }
            this.written = written;
        }
        
        public final void abort() throws IOException {
            final DiskLruCache this$0 = this.this$0;
            synchronized (this$0) {
                if (this.done ^ true) {
                    if (ng2.e.a((Object)this.getEntry$okhttp().getCurrentEditor$okhttp(), (Object)this)) {
                        this$0.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                    final cg2.j a = cg2.j.a;
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        
        public final void commit() throws IOException {
            final DiskLruCache this$0 = this.this$0;
            synchronized (this$0) {
                if (this.done ^ true) {
                    if (ng2.e.a((Object)this.getEntry$okhttp().getCurrentEditor$okhttp(), (Object)this)) {
                        this$0.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                    final cg2.j a = cg2.j.a;
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        
        public final void detach$okhttp() {
            if (ng2.e.a((Object)this.entry.getCurrentEditor$okhttp(), (Object)this)) {
                if (DiskLruCache.access$getCivilizedFileSystem$p(this.this$0)) {
                    this.this$0.completeEdit$okhttp(this, false);
                }
                else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }
        
        public final Entry getEntry$okhttp() {
            return this.entry;
        }
        
        public final boolean[] getWritten$okhttp() {
            return this.written;
        }
        
        public final e0 newSink(final int n) {
            final DiskLruCache this$0 = this.this$0;
            synchronized (this$0) {
                if (this.done ^ true) {
                    if (!ng2.e.a((Object)this.getEntry$okhttp().getCurrentEditor$okhttp(), (Object)this)) {
                        return (e0)new fk2.b();
                    }
                    if (!this.getEntry$okhttp().getReadable$okhttp()) {
                        final boolean[] written$okhttp = this.getWritten$okhttp();
                        ng2.e.c((Object)written$okhttp);
                        written$okhttp[n] = true;
                    }
                    final y y = this.getEntry$okhttp().getDirtyFiles$okhttp().get(n);
                    try {
                        return (e0)new FaultHidingSink(this$0.getFileSystem$okhttp().sink(y), (l<? super IOException, cg2.j>)new DiskLruCache$Editor$newSink$1$1(this$0, this));
                    }
                    catch (final FileNotFoundException ex) {
                        return (e0)new fk2.b();
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        
        public final g0 newSource(final int p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        okhttp3/internal/cache/DiskLruCache$Editor.this$0:Lokhttp3/internal/cache/DiskLruCache;
            //     4: astore          5
            //     6: aload           5
            //     8: monitorenter   
            //     9: aload_0        
            //    10: getfield        okhttp3/internal/cache/DiskLruCache$Editor.done:Z
            //    13: iconst_1       
            //    14: ixor           
            //    15: ifeq            100
            //    18: aload_0        
            //    19: invokevirtual   okhttp3/internal/cache/DiskLruCache$Editor.getEntry$okhttp:()Lokhttp3/internal/cache/DiskLruCache$Entry;
            //    22: invokevirtual   okhttp3/internal/cache/DiskLruCache$Entry.getReadable$okhttp:()Z
            //    25: istore_2       
            //    26: aconst_null    
            //    27: astore_3       
            //    28: iload_2        
            //    29: ifeq            95
            //    32: aload_0        
            //    33: invokevirtual   okhttp3/internal/cache/DiskLruCache$Editor.getEntry$okhttp:()Lokhttp3/internal/cache/DiskLruCache$Entry;
            //    36: invokevirtual   okhttp3/internal/cache/DiskLruCache$Entry.getCurrentEditor$okhttp:()Lokhttp3/internal/cache/DiskLruCache$Editor;
            //    39: aload_0        
            //    40: invokestatic    ng2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //    43: ifeq            95
            //    46: aload_0        
            //    47: invokevirtual   okhttp3/internal/cache/DiskLruCache$Editor.getEntry$okhttp:()Lokhttp3/internal/cache/DiskLruCache$Entry;
            //    50: invokevirtual   okhttp3/internal/cache/DiskLruCache$Entry.getZombie$okhttp:()Z
            //    53: istore_2       
            //    54: iload_2        
            //    55: ifeq            61
            //    58: goto            95
            //    61: aload           5
            //    63: invokevirtual   okhttp3/internal/cache/DiskLruCache.getFileSystem$okhttp:()Lfk2/j;
            //    66: aload_0        
            //    67: invokevirtual   okhttp3/internal/cache/DiskLruCache$Editor.getEntry$okhttp:()Lokhttp3/internal/cache/DiskLruCache$Entry;
            //    70: invokevirtual   okhttp3/internal/cache/DiskLruCache$Entry.getCleanFiles$okhttp:()Ljava/util/List;
            //    73: iload_1        
            //    74: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
            //    79: checkcast       Lfk2/y;
            //    82: invokevirtual   fk2/j.source:(Lfk2/y;)Lfk2/g0;
            //    85: astore          4
            //    87: aload           4
            //    89: astore_3       
            //    90: aload           5
            //    92: monitorexit    
            //    93: aload_3        
            //    94: areturn        
            //    95: aload           5
            //    97: monitorexit    
            //    98: aconst_null    
            //    99: areturn        
            //   100: new             Ljava/lang/IllegalStateException;
            //   103: astore_3       
            //   104: aload_3        
            //   105: ldc             "Check failed."
            //   107: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
            //   110: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
            //   113: aload_3        
            //   114: athrow         
            //   115: astore_3       
            //   116: aload           5
            //   118: monitorexit    
            //   119: aload_3        
            //   120: athrow         
            //   121: astore          4
            //   123: goto            90
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                           
            //  -----  -----  -----  -----  -------------------------------
            //  9      26     115    121    Any
            //  32     54     115    121    Any
            //  61     87     121    126    Ljava/io/FileNotFoundException;
            //  61     87     115    121    Any
            //  100    115    115    121    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0061:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\t\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\bH\u0010IJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001d\u0010\u000e\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0018\u001a\b\u0018\u00010\u0014R\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\"\u0010+\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R(\u00105\u001a\b\u0018\u000104R\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010;\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006J" }, d2 = { "Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "", "", "strings", "", "invalidLengths", "", "index", "Lfk2/g0;", "newSource", "Lcg2/j;", "setLengths$okhttp", "(Ljava/util/List;)V", "setLengths", "Lfk2/e;", "writer", "writeLengths$okhttp", "(Lfk2/e;)V", "writeLengths", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "key", "Ljava/lang/String;", "getKey$okhttp", "()Ljava/lang/String;", "", "lengths", "[J", "getLengths$okhttp", "()[J", "", "Lfk2/y;", "cleanFiles", "Ljava/util/List;", "getCleanFiles$okhttp", "()Ljava/util/List;", "dirtyFiles", "getDirtyFiles$okhttp", "", "readable", "Z", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "zombie", "getZombie$okhttp", "setZombie$okhttp", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "lockingSourceCount", "I", "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "", "sequenceNumber", "J", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public final class Entry
    {
        private final List<y> cleanFiles;
        private Editor currentEditor;
        private final List<y> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        public final DiskLruCache this$0;
        private boolean zombie;
        
        public Entry(final DiskLruCache this$0, final String key) {
            ng2.e.f((Object)this$0, "this$0");
            ng2.e.f((Object)key, "key");
            this.this$0 = this$0;
            this.key = key;
            this.lengths = new long[this$0.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList<y>();
            this.dirtyFiles = new ArrayList<y>();
            final StringBuilder sb = new StringBuilder(key);
            sb.append('.');
            final int length = sb.length();
            for (int valueCount$okhttp = this$0.getValueCount$okhttp(), i = 0; i < valueCount$okhttp; ++i) {
                sb.append(i);
                final List<y> cleanFiles = this.cleanFiles;
                final y directory = this.this$0.getDirectory();
                final String string = sb.toString();
                ng2.e.e((Object)string, "fileBuilder.toString()");
                cleanFiles.add(directory.d(string));
                sb.append(".tmp");
                final List<y> dirtyFiles = this.dirtyFiles;
                final y directory2 = this.this$0.getDirectory();
                final String string2 = sb.toString();
                ng2.e.e((Object)string2, "fileBuilder.toString()");
                dirtyFiles.add(directory2.d(string2));
                sb.setLength(length);
            }
        }
        
        private final Void invalidLengths(final List<String> list) throws IOException {
            throw new IOException(ng2.e.l((Object)list, "unexpected journal line: "));
        }
        
        private final g0 newSource(final int n) {
            final g0 source = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(n));
            if (DiskLruCache.access$getCivilizedFileSystem$p(this.this$0)) {
                return source;
            }
            ++this.lockingSourceCount;
            return (g0)new DiskLruCache$Entry$newSource.DiskLruCache$Entry$newSource$1(source, this.this$0, this);
        }
        
        public final List<y> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }
        
        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }
        
        public final List<y> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }
        
        public final String getKey$okhttp() {
            return this.key;
        }
        
        public final long[] getLengths$okhttp() {
            return this.lengths;
        }
        
        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }
        
        public final boolean getReadable$okhttp() {
            return this.readable;
        }
        
        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }
        
        public final boolean getZombie$okhttp() {
            return this.zombie;
        }
        
        public final void setCurrentEditor$okhttp(final Editor currentEditor) {
            this.currentEditor = currentEditor;
        }
        
        public final void setLengths$okhttp(final List<String> list) throws IOException {
            ng2.e.f((Object)list, "strings");
            if (list.size() == this.this$0.getValueCount$okhttp()) {
                int i = 0;
                try {
                    while (i < list.size()) {
                        this.lengths[i] = Long.parseLong((String)list.get(i));
                        ++i;
                    }
                    return;
                }
                catch (final NumberFormatException ex) {
                    this.invalidLengths(list);
                    throw new KotlinNothingValueException();
                }
            }
            this.invalidLengths(list);
            throw new KotlinNothingValueException();
        }
        
        public final void setLockingSourceCount$okhttp(final int lockingSourceCount) {
            this.lockingSourceCount = lockingSourceCount;
        }
        
        public final void setReadable$okhttp(final boolean readable) {
            this.readable = readable;
        }
        
        public final void setSequenceNumber$okhttp(final long sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
        }
        
        public final void setZombie$okhttp(final boolean zombie) {
            this.zombie = zombie;
        }
        
        public final Snapshot snapshot$okhttp() {
            final DiskLruCache this$0 = this.this$0;
            if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this$0)) {
                final StringBuilder t = a.t("Thread ");
                t.append((Object)Thread.currentThread().getName());
                t.append(" MUST hold lock on ");
                t.append(this$0);
                throw new AssertionError((Object)t.toString());
            }
            if (!this.readable) {
                return null;
            }
            if (!DiskLruCache.access$getCivilizedFileSystem$p(this.this$0) && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            final ArrayList list = new ArrayList();
            final long[] array = this.lengths.clone();
            int i = 0;
            try {
                while (i < this.this$0.getValueCount$okhttp()) {
                    list.add(this.newSource(i));
                    ++i;
                }
                return new Snapshot(this.key, this.sequenceNumber, list, array);
            }
            catch (final FileNotFoundException ex) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    _UtilCommonKt.closeQuietly((Closeable)iterator.next());
                }
                try {
                    this.this$0.removeEntry$okhttp(this);
                    return null;
                }
                catch (final IOException ex2) {}
            }
        }
        
        public final void writeLengths$okhttp(final e e) throws IOException {
            ng2.e.f((Object)e, "writer");
            final long[] lengths = this.lengths;
            final int length = lengths.length;
            int i = 0;
            while (i < length) {
                final long n = lengths[i];
                ++i;
                e.writeByte(32).t1(n);
            }
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u0005J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a" }, d2 = { "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "", "key", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "edit", "", "index", "Lfk2/g0;", "getSource", "", "getLength", "Lcg2/j;", "close", "Ljava/lang/String;", "sequenceNumber", "J", "", "sources", "Ljava/util/List;", "", "lengths", "[J", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public final class Snapshot implements Closeable
    {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<g0> sources;
        public final DiskLruCache this$0;
        
        public Snapshot(final DiskLruCache this$0, final String key, final long sequenceNumber, final List<? extends g0> sources, final long[] lengths) {
            ng2.e.f((Object)this$0, "this$0");
            ng2.e.f((Object)key, "key");
            ng2.e.f((Object)sources, "sources");
            ng2.e.f((Object)lengths, "lengths");
            this.this$0 = this$0;
            this.key = key;
            this.sequenceNumber = sequenceNumber;
            this.sources = (List<g0>)sources;
            this.lengths = lengths;
        }
        
        @Override
        public void close() {
            final Iterator<g0> iterator = this.sources.iterator();
            while (iterator.hasNext()) {
                _UtilCommonKt.closeQuietly(iterator.next());
            }
        }
        
        public final Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }
        
        public final long getLength(final int n) {
            return this.lengths[n];
        }
        
        public final g0 getSource(final int n) {
            return this.sources.get(n);
        }
        
        public final String key() {
            return this.key;
        }
    }
}
