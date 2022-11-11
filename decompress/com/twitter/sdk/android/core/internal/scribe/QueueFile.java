// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import java.util.logging.Level;
import java.util.NoSuchElementException;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.io.IOException;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.logging.Logger;
import java.io.Closeable;

public class QueueFile implements Closeable
{
    public static final int HEADER_LENGTH = 16;
    private static final int INITIAL_LENGTH = 4096;
    private static final Logger LOGGER;
    private final byte[] buffer;
    private int elementCount;
    public int fileLength;
    private Element first;
    private Element last;
    private final RandomAccessFile raf;
    
    static {
        LOGGER = Logger.getLogger(QueueFile.class.getName());
    }
    
    public QueueFile(final File file) throws IOException {
        this.buffer = new byte[16];
        if (!file.exists()) {
            initialize(file);
        }
        this.raf = open(file);
        this.readHeader();
    }
    
    public QueueFile(final RandomAccessFile raf) throws IOException {
        this.buffer = new byte[16];
        this.raf = raf;
        this.readHeader();
    }
    
    public static /* synthetic */ RandomAccessFile access$400(final QueueFile queueFile) {
        return queueFile.raf;
    }
    
    private void expandIfNecessary(int n) throws IOException {
        final int n2 = n + 4;
        int remainingBytes = this.remainingBytes();
        if (remainingBytes >= n2) {
            return;
        }
        n = this.fileLength;
        int i;
        int n3;
        do {
            i = remainingBytes + n;
            n3 = n << 1;
            remainingBytes = i;
            n = n3;
        } while (i < n2);
        this.setLength(n3);
        final Element last = this.last;
        n = this.wrapPosition(last.position + 4 + last.length);
        if (n < this.first.position) {
            final FileChannel channel = this.raf.getChannel();
            channel.position(this.fileLength);
            final long n4 = n - 4;
            if (channel.transferTo(16L, n4, channel) != n4) {
                throw new AssertionError((Object)"Copied insufficient number of bytes!");
            }
        }
        final int position = this.last.position;
        n = this.first.position;
        if (position < n) {
            final int n5 = this.fileLength + position - 16;
            this.writeHeader(n3, this.elementCount, n, n5);
            this.last = new Element(n5, this.last.length);
        }
        else {
            this.writeHeader(n3, this.elementCount, n, position);
        }
        this.fileLength = n3;
    }
    
    private static void initialize(final File file) throws IOException {
        final StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".tmp");
        final File file2 = new File(sb.toString());
        final RandomAccessFile open = open(file2);
        try {
            open.setLength(4096L);
            open.seek(0L);
            final byte[] array = new byte[16];
            writeInts(array, 4096, 0, 0, 0);
            open.write(array);
            open.close();
            if (file2.renameTo(file)) {
                return;
            }
            throw new IOException("Rename failed!");
        }
        finally {
            open.close();
        }
    }
    
    private static <T> T nonNull(final T t, final String s) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(s);
    }
    
    private static RandomAccessFile open(final File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }
    
    private Element readElement(final int n) throws IOException {
        if (n == 0) {
            return Element.NULL;
        }
        this.raf.seek(n);
        return new Element(n, this.raf.readInt());
    }
    
    private void readHeader() throws IOException {
        this.raf.seek(0L);
        this.raf.readFully(this.buffer);
        final int int1 = readInt(this.buffer, 0);
        this.fileLength = int1;
        if (int1 <= this.raf.length()) {
            this.elementCount = readInt(this.buffer, 4);
            final int int2 = readInt(this.buffer, 8);
            final int int3 = readInt(this.buffer, 12);
            this.first = this.readElement(int2);
            this.last = this.readElement(int3);
            return;
        }
        final StringBuilder r = a.r("File is truncated. Expected length: ");
        r.append(this.fileLength);
        r.append(", Actual length: ");
        r.append(this.raf.length());
        throw new IOException(r.toString());
    }
    
    private static int readInt(final byte[] array, final int n) {
        return ((array[n] & 0xFF) << 24) + ((array[n + 1] & 0xFF) << 16) + ((array[n + 2] & 0xFF) << 8) + (array[n + 3] & 0xFF);
    }
    
    private int remainingBytes() {
        return this.fileLength - this.usedBytes();
    }
    
    private void ringRead(int wrapPosition, final byte[] array, final int n, final int n2) throws IOException {
        wrapPosition = this.wrapPosition(wrapPosition);
        final int fileLength = this.fileLength;
        if (wrapPosition + n2 <= fileLength) {
            this.raf.seek(wrapPosition);
            this.raf.readFully(array, n, n2);
        }
        else {
            final int n3 = fileLength - wrapPosition;
            this.raf.seek(wrapPosition);
            this.raf.readFully(array, n, n3);
            this.raf.seek(16L);
            this.raf.readFully(array, n + n3, n2 - n3);
        }
    }
    
    private void ringWrite(int wrapPosition, final byte[] array, final int n, final int n2) throws IOException {
        wrapPosition = this.wrapPosition(wrapPosition);
        final int fileLength = this.fileLength;
        if (wrapPosition + n2 <= fileLength) {
            this.raf.seek(wrapPosition);
            this.raf.write(array, n, n2);
        }
        else {
            final int n3 = fileLength - wrapPosition;
            this.raf.seek(wrapPosition);
            this.raf.write(array, n, n3);
            this.raf.seek(16L);
            this.raf.write(array, n + n3, n2 - n3);
        }
    }
    
    private void setLength(final int n) throws IOException {
        this.raf.setLength(n);
        this.raf.getChannel().force(true);
    }
    
    private int wrapPosition(int n) {
        final int fileLength = this.fileLength;
        if (n >= fileLength) {
            n = n + 16 - fileLength;
        }
        return n;
    }
    
    private void writeHeader(final int n, final int n2, final int n3, final int n4) throws IOException {
        writeInts(this.buffer, n, n2, n3, n4);
        this.raf.seek(0L);
        this.raf.write(this.buffer);
    }
    
    private static void writeInt(final byte[] array, final int n, final int n2) {
        array[n] = (byte)(n2 >> 24);
        array[n + 1] = (byte)(n2 >> 16);
        array[n + 2] = (byte)(n2 >> 8);
        array[n + 3] = (byte)n2;
    }
    
    private static void writeInts(final byte[] array, final int... array2) {
        final int length = array2.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            writeInt(array, n, array2[i]);
            n += 4;
            ++i;
        }
    }
    
    public void add(final byte[] array) throws IOException {
        this.add(array, 0, array.length);
    }
    
    public void add(final byte[] array, int n, final int n2) throws IOException {
        synchronized (this) {
            nonNull(array, "buffer");
            if ((n | n2) >= 0 && n2 <= array.length - n) {
                this.expandIfNecessary(n2);
                final boolean empty = this.isEmpty();
                int wrapPosition;
                if (empty) {
                    wrapPosition = 16;
                }
                else {
                    final Element last = this.last;
                    wrapPosition = this.wrapPosition(last.position + 4 + last.length);
                }
                final Element element = new Element(wrapPosition, n2);
                writeInt(this.buffer, 0, n2);
                this.ringWrite(element.position, this.buffer, 0, 4);
                this.ringWrite(element.position + 4, array, n, n2);
                if (empty) {
                    n = element.position;
                }
                else {
                    n = this.first.position;
                }
                this.writeHeader(this.fileLength, this.elementCount + 1, n, element.position);
                this.last = element;
                ++this.elementCount;
                if (empty) {
                    this.first = element;
                }
                return;
            }
            throw new IndexOutOfBoundsException();
        }
    }
    
    public void clear() throws IOException {
        synchronized (this) {
            this.writeHeader(4096, 0, 0, 0);
            this.elementCount = 0;
            final Element null = Element.NULL;
            this.first = null;
            this.last = null;
            if (this.fileLength > 4096) {
                this.setLength(4096);
            }
            this.fileLength = 4096;
        }
    }
    
    @Override
    public void close() throws IOException {
        synchronized (this) {
            this.raf.close();
        }
    }
    
    public void forEach(final ElementReader elementReader) throws IOException {
        synchronized (this) {
            int n = this.first.position;
            for (int i = 0; i < this.elementCount; ++i) {
                final Element element = this.readElement(n);
                elementReader.read(new ElementInputStream(element, null), element.length);
                n = this.wrapPosition(element.position + 4 + element.length);
            }
        }
    }
    
    public boolean hasSpaceFor(final int n, final int n2) {
        return this.usedBytes() + 4 + n <= n2;
    }
    
    public boolean isEmpty() {
        synchronized (this) {
            return this.elementCount == 0;
        }
    }
    
    public void peek(final ElementReader elementReader) throws IOException {
        synchronized (this) {
            if (this.elementCount > 0) {
                elementReader.read(new ElementInputStream(this.first, null), this.first.length);
            }
        }
    }
    
    public byte[] peek() throws IOException {
        synchronized (this) {
            if (this.isEmpty()) {
                return null;
            }
            final Element first = this.first;
            final int length = first.length;
            final byte[] array = new byte[length];
            this.ringRead(first.position + 4, array, 0, length);
            return array;
        }
    }
    
    public void remove() throws IOException {
        synchronized (this) {
            if (!this.isEmpty()) {
                if (this.elementCount == 1) {
                    this.clear();
                }
                else {
                    final Element first = this.first;
                    final int wrapPosition = this.wrapPosition(first.position + 4 + first.length);
                    this.ringRead(wrapPosition, this.buffer, 0, 4);
                    final int int1 = readInt(this.buffer, 0);
                    this.writeHeader(this.fileLength, this.elementCount - 1, wrapPosition, this.last.position);
                    --this.elementCount;
                    this.first = new Element(wrapPosition, int1);
                }
                return;
            }
            throw new NoSuchElementException();
        }
    }
    
    public int size() {
        synchronized (this) {
            return this.elementCount;
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.fileLength);
        sb.append(", size=");
        sb.append(this.elementCount);
        sb.append(", first=");
        sb.append(this.first);
        sb.append(", last=");
        sb.append(this.last);
        sb.append(", element lengths=[");
        try {
            this.forEach((ElementReader)new QueueFile$1(this, sb));
        }
        catch (final IOException ex) {
            QueueFile.LOGGER.log(Level.WARNING, "read error", ex);
        }
        sb.append("]]");
        return sb.toString();
    }
    
    public int usedBytes() {
        if (this.elementCount == 0) {
            return 16;
        }
        final Element last = this.last;
        final int position = last.position;
        final int position2 = this.first.position;
        if (position >= position2) {
            return position - position2 + 4 + last.length + 16;
        }
        return position + 4 + last.length + this.fileLength - position2;
    }
    
    public static class Element
    {
        public static final int HEADER_LENGTH = 4;
        public static final Element NULL;
        public final int length;
        public final int position;
        
        static {
            NULL = new Element(0, 0);
        }
        
        public Element(final int position, final int length) {
            this.position = position;
            this.length = length;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getClass().getSimpleName());
            sb.append("[position = ");
            sb.append(this.position);
            sb.append(", length = ");
            return al0.a.l(sb, this.length, "]");
        }
    }
    
    public final class ElementInputStream extends InputStream
    {
        private int position;
        private int remaining;
        
        private ElementInputStream(final Element element) {
            this.position = QueueFile.this.wrapPosition(element.position + 4);
            this.remaining = element.length;
        }
        
        @Override
        public int read() throws IOException {
            if (this.remaining == 0) {
                return -1;
            }
            QueueFile.access$400(QueueFile.this).seek(this.position);
            final int read = QueueFile.access$400(QueueFile.this).read();
            this.position = QueueFile.this.wrapPosition(this.position + 1);
            --this.remaining;
            return read;
        }
        
        @Override
        public int read(final byte[] array, final int n, final int n2) throws IOException {
            nonNull(array, "buffer");
            if ((n | n2) < 0 || n2 > array.length - n) {
                throw new ArrayIndexOutOfBoundsException();
            }
            final int remaining = this.remaining;
            if (remaining > 0) {
                int n3;
                if ((n3 = n2) > remaining) {
                    n3 = remaining;
                }
                QueueFile.this.ringRead(this.position, array, n, n3);
                this.position = QueueFile.this.wrapPosition(this.position + n3);
                this.remaining -= n3;
                return n3;
            }
            return -1;
        }
    }
    
    public interface ElementReader
    {
        void read(final InputStream p0, final int p1) throws IOException;
    }
}
