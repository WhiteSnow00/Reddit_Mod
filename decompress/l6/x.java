// 
// Decompiled by Procyon v0.6.0
// 

package l6;

import androidx.work.WorkInfo$State;
import androidx.work.OutOfQuotaPolicy;
import android.os.Build$VERSION;
import androidx.work.NetworkType;
import androidx.work.BackoffPolicy;
import java.io.IOException;
import android.net.Uri;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import c6.c;

public final class x
{
    public static c a(final byte[] array) {
        final c c = new c();
        if (array == null) {
            return c;
        }
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);
        Throwable t = null;
        Label_0188: {
            Label_0169: {
                ObjectInputStream objectInputStream;
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        try {
                            for (int i = objectInputStream.readInt(); i > 0; --i) {
                                c.a.add(new c.a(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                            }
                            try {
                                objectInputStream.close();
                                break Label_0169;
                            }
                            catch (final IOException ex) {
                                ex.printStackTrace();
                                break Label_0169;
                            }
                        }
                        finally {}
                    }
                    catch (final IOException t) {}
                }
                catch (final IOException t) {
                    objectInputStream = null;
                }
                finally {
                    break Label_0188;
                }
                t.printStackTrace();
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    }
                    catch (final IOException ex2) {
                        ex2.printStackTrace();
                    }
                }
                try {
                    byteArrayInputStream.close();
                }
                catch (final IOException ex3) {
                    ex3.printStackTrace();
                }
            }
            return c;
            final IOException ex4;
            t = ex4;
        }
        if (t != null) {
            try {
                ((ObjectInputStream)t).close();
            }
            catch (final IOException ex5) {
                ex5.printStackTrace();
            }
        }
        try {
            byteArrayInputStream.close();
        }
        catch (final IOException ex6) {
            ex6.printStackTrace();
        }
    }
    
    public static BackoffPolicy b(final int n) {
        if (n == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (n == 1) {
            return BackoffPolicy.LINEAR;
        }
        throw new IllegalArgumentException(d.i("Could not convert ", n, " to BackoffPolicy"));
    }
    
    public static NetworkType c(final int n) {
        if (n == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (n == 1) {
            return NetworkType.CONNECTED;
        }
        if (n == 2) {
            return NetworkType.UNMETERED;
        }
        if (n == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (n == 4) {
            return NetworkType.METERED;
        }
        if (Build$VERSION.SDK_INT >= 30 && n == 5) {
            return NetworkType.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException(d.i("Could not convert ", n, " to NetworkType"));
    }
    
    public static OutOfQuotaPolicy d(final int n) {
        if (n == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (n == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException(d.i("Could not convert ", n, " to OutOfQuotaPolicy"));
    }
    
    public static WorkInfo$State e(final int n) {
        if (n == 0) {
            return WorkInfo$State.ENQUEUED;
        }
        if (n == 1) {
            return WorkInfo$State.RUNNING;
        }
        if (n == 2) {
            return WorkInfo$State.SUCCEEDED;
        }
        if (n == 3) {
            return WorkInfo$State.FAILED;
        }
        if (n == 4) {
            return WorkInfo$State.BLOCKED;
        }
        if (n == 5) {
            return WorkInfo$State.CANCELLED;
        }
        throw new IllegalArgumentException(d.i("Could not convert ", n, " to State"));
    }
    
    public static int f(final WorkInfo$State workInfo$State) {
        switch (x$a.a[((Enum)workInfo$State).ordinal()]) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not convert ");
                sb.append(workInfo$State);
                sb.append(" to int");
                throw new IllegalArgumentException(sb.toString());
            }
            case 6: {
                return 5;
            }
            case 5: {
                return 4;
            }
            case 4: {
                return 3;
            }
            case 3: {
                return 2;
            }
            case 2: {
                return 1;
            }
            case 1: {
                return 0;
            }
        }
    }
}
