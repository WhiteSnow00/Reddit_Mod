// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.common;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.Closeable;
import java.util.concurrent.CountDownLatch;

public class Util
{
    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        while (true) {
            try {
                countDownLatch.await();
            }
            catch (final InterruptedException ex) {
                continue;
            }
            break;
        }
    }
    
    public static void close(final Closeable closeable, final boolean b) throws IOException {
        if (closeable != null) {
            if (b) {
                try {
                    closeable.close();
                }
                catch (final IOException ex) {
                    LogUtil.e(ex, "Hiding IOException because another is pending");
                }
            }
            else {
                closeable.close();
            }
        }
    }
    
    public static void copy(final InputStream inputStream, final OutputStream outputStream, final byte[] array) throws IOException {
        while (true) {
            final int read = inputStream.read(array);
            if (read == -1) {
                break;
            }
            outputStream.write(array, 0, read);
        }
    }
    
    public static <T> T getUninterruptibly(final Future<T> future) throws ExecutionException {
        try {
            return future.get();
        }
        catch (final InterruptedException ex) {
            return future.get();
        }
    }
    
    public static <T> T getUninterruptibly(final Future<T> future, long millis, final TimeUnit timeUnit) throws TimeoutException, ExecutionException {
        millis = timeUnit.toMillis(millis);
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            return future.get(millis, TimeUnit.MILLISECONDS);
        }
        catch (final InterruptedException ex) {
            millis -= System.currentTimeMillis() - currentTimeMillis;
            return future.get(millis, TimeUnit.MILLISECONDS);
        }
    }
    
    public static void joinUninterruptibly(final Thread thread) {
        while (true) {
            try {
                thread.join();
            }
            catch (final InterruptedException ex) {
                continue;
            }
            break;
        }
    }
    
    public static String readAsUTF8(final InputStream inputStream) throws IOException {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream, new byte[1024]);
        return byteArrayOutputStream.toString("UTF-8");
    }
    
    public static void sleepUninterruptibly(long n) {
        final long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            try {
                Thread.sleep(n);
            }
            catch (final InterruptedException ex) {
                if ((n -= System.currentTimeMillis() - currentTimeMillis) <= 0L) {
                    return;
                }
                continue;
            }
            break;
        }
    }
    
    public static void throwIf(final boolean b) {
        if (!b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void throwIfNot(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void throwIfNot(final boolean b, final String s, final Object... array) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.format(s, array));
    }
    
    public static void throwIfNotNull(final Object o) {
        if (o == null) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static <T> T throwIfNull(final T t) {
        t.getClass();
        return t;
    }
    
    public static <T1, T2> void throwIfNull(final T1 t1, final T2 t2) {
        throwIfNull(t1);
        throwIfNull(t2);
    }
    
    public static <T1, T2, T3> void throwIfNull(final T1 t1, final T2 t2, final T3 t3) {
        throwIfNull(t1);
        throwIfNull(t2);
        throwIfNull(t3);
    }
}
