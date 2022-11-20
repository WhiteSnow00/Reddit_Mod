// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.net;

import java.io.InputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

class InputStreamConsumer implements StreamConsumer
{
    private static final int BUFFER_SIZE = 16384;
    private final InputStreamConsumer.InputStreamConsumer$Provider provider;
    private final Request request;
    
    public InputStreamConsumer(final Request request, final InputStreamConsumer.InputStreamConsumer$Provider provider) {
        this.request = request;
        this.provider = provider;
    }
    
    public void consume(final ReadCallback readCallback) {
        final Object lock = this.request.lock();
        synchronized (lock) {
            if (this.request.isCancelled()) {
                return;
            }
            final int timeout = readCallback.getTimeout();
            monitorexit(lock);
            try {
                final InputStream inputStream = this.provider.getInputStream(timeout);
                try {
                    final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(16384);
                    final byte[] array = new byte[16384];
                    boolean b = false;
                    while (!b && !this.request.isCancelled()) {
                        int read = inputStream.read(array);
                        allocateDirect.rewind();
                        if (read == -1) {
                            b = true;
                            read = 0;
                        }
                        else {
                            allocateDirect.put(array, 0, read);
                        }
                        synchronized (this.request.lock()) {
                            if (this.request.isCancelled()) {
                                continue;
                            }
                            readCallback.onBuffer(allocateDirect, read, b);
                            continue;
                        }
                        break;
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
                finally {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        finally {
                            final Throwable t;
                            ((Throwable)lock).addSuppressed(t);
                        }
                    }
                }
            }
            catch (final IOException lock) {
                ((Throwable)lock).printStackTrace();
            }
            if (lock != null) {
                final Object lock2 = this.request.lock();
                monitorenter(lock2);
                try {
                    if (!this.request.isCancelled()) {
                        readCallback.onError((Exception)lock);
                    }
                    monitorexit(lock2);
                }
                finally {}
            }
        }
    }
}
