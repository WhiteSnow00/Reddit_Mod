// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.postsubmit;

import com.coremedia.iso.boxes.Container;
import java.nio.channels.FileChannel;
import com.googlecode.mp4parser.BasicContainer;
import java.util.Iterator;
import java.util.List;
import rj.d;
import java.io.File;
import java.io.IOException;
import java.io.Closeable;
import java.nio.channels.WritableByteChannel;
import java.io.FileOutputStream;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import uj.f;
import java.util.LinkedList;
import com.googlecode.mp4parser.c;
import android.content.Context;
import android.text.TextUtils;
import android.content.Intent;
import java.util.Arrays;
import rj.g;
import ng2.a;
import android.app.IntentService;

public class VideoTrimService extends IntentService
{
    public static final ng2.a f;
    
    static {
        f = new ng2.a();
    }
    
    public VideoTrimService() {
        super("VideoTrimService");
    }
    
    public static double a(final g g, final double n) {
        final int length = g.C1().length;
        final double[] array = new double[length];
        final int n2 = 0;
        final double n3 = 0.0;
        long n4 = 0L;
        int n5 = 0;
        double n6 = 0.0;
        int i;
        double n7;
        while (true) {
            i = n2;
            n7 = n3;
            if (n5 >= g.U1().length) {
                break;
            }
            final long n8 = g.U1()[n5];
            final long[] c1 = g.C1();
            ++n4;
            if (Arrays.binarySearch(c1, n4) >= 0) {
                array[Arrays.binarySearch(g.C1(), n4)] = n6;
            }
            n6 += n8 / (double)g.s1().g;
            ++n5;
        }
        while (i < length) {
            final double n9 = array[i];
            if (n9 >= n) {
                double n10 = n7;
                if (Math.abs(n - n9) < Math.abs(n - n7)) {
                    n10 = n9;
                }
                return n10;
            }
            ++i;
            n7 = n9;
        }
        return Double.MAX_VALUE;
    }
    
    public final void onHandleIntent(final Intent intent) {
        final String stringExtra = intent.getStringExtra("video_file");
        final int intExtra = intent.getIntExtra("video_start_secs", 0);
        final int intExtra2 = intent.getIntExtra("video_end_secs", 0);
        if (TextUtils.isEmpty((CharSequence)stringExtra) || intExtra < 0 || intExtra2 < intExtra) {
            goto Label_0675;
        }
        System.nanoTime();
        try {
            final File d = et0.a.d(1, (Context)this);
            try {
                final d a = sj.a.a((com.googlecode.mp4parser.a)new c(stringExtra));
                final List b = a.b;
                a.b = new LinkedList();
                double a2 = intExtra;
                double max = intExtra2;
                final Iterator iterator = b.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    final g g = (g)iterator.next();
                    if (g.C1() != null && g.C1().length > 0) {
                        if (n != 0) {
                            throw new TrimException("Unsupported number of sync sample tracks.");
                        }
                        a2 = a(g, a2);
                        max = Math.max(a2, a(g, max));
                        n = 1;
                    }
                }
                for (g g2 : b) {
                    long n2 = -1L;
                    int i = 0;
                    double n3 = -1.0;
                    double n4 = 0.0;
                    long n5 = 0L;
                    long n6 = -1L;
                    while (i < g2.U1().length) {
                        final long n7 = g2.U1()[i];
                        final double n8 = dcmpl(n4, n3);
                        long n9 = n6;
                        if (n8 > 0) {
                            n9 = n6;
                            if (n4 <= a2) {
                                n9 = n5;
                            }
                        }
                        long n10 = n2;
                        if (n8 > 0) {
                            n10 = n2;
                            if (n4 <= max) {
                                n10 = n5 + 1L;
                            }
                        }
                        final double n11 = n7 / (double)g2.s1().g;
                        ++n5;
                        ++i;
                        n3 = n4;
                        n4 += n11;
                        n6 = n9;
                        n2 = n10;
                    }
                    a.a((g)new uj.c(new g[] { (g)new f(g2, n6, n2) }));
                }
                final BasicContainer a3 = new DefaultMp4Builder().a(a);
                final FileOutputStream fileOutputStream = new FileOutputStream(d);
                try {
                    final FileChannel channel = fileOutputStream.getChannel();
                    try {
                        ((Container)a3).writeContainer((WritableByteChannel)channel);
                        et0.a.a((Closeable)channel);
                        et0.a.a((Closeable)fileOutputStream);
                        System.nanoTime();
                        final ng2.a f = VideoTrimService.f;
                        d.getAbsolutePath();
                        final a a4 = new a();
                    }
                    catch (final IOException ex) {}
                    catch (final TrimException ex2) {}
                }
                catch (final IOException ex3) {}
                catch (final TrimException ex4) {}
            }
            catch (final TrimException ex5) {}
            catch (final IOException ex6) {}
        }
        catch (final TrimException ex7) {}
        catch (final IOException ex8) {}
    }
    
    public static final class TrimException extends Exception
    {
        public TrimException() {
            super("Trim failed");
        }
        
        public TrimException(final String s) {
            super(s);
        }
    }
    
    public static final class a
    {
    }
}
