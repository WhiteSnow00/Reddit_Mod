// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayDeque;
import android.os.IInterface;
import java.util.Iterator;
import java.util.List;
import android.content.pm.ResolveInfo;
import android.os.Message;
import android.os.RemoteException;
import android.os.DeadObjectException;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import android.os.HandlerThread;
import android.os.Handler$Callback;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.InvocationTargetException;
import android.app.AppOpsManager;
import android.os.Bundle;
import android.app.Notification;
import android.content.ComponentName;
import android.text.TextUtils;
import android.provider.Settings$Secure;
import android.content.ContentResolver;
import java.lang.reflect.Field;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import android.os.Build$VERSION;
import java.util.HashSet;
import com.bytedance.covode.number.Covode;
import android.content.Context;
import android.app.NotificationManager;
import java.util.Set;

public final class 06K
{
    public static final Object LIZIZ;
    public static String LIZJ;
    public static Set<String> LIZLLL;
    public static final Object LJFF;
    public static c LJI;
    public final NotificationManager LIZ;
    public final Context LJ;
    
    static {
        Covode.recordClassIndex(710);
        LIZIZ = new Object();
        06K.LIZLLL = new HashSet<String>();
        LJFF = new Object();
    }
    
    public 06K(final Context lj) {
        this.LJ = lj;
        this.LIZ = (NotificationManager)LIZ(lj, "notification");
    }
    
    public static 06K LIZ(final Context context) {
        return new 06K(context);
    }
    
    public static Object LIZ(Context context, String ex) {
        Label_0158: {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(ex)) {
                if (!2JT.LIZ) {
                    break Label_0158;
                }
                synchronized (ClipboardManager.class) {
                    final Object systemService = context.getSystemService((String)ex);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            final Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            ex = (Exception)declaredField.get(systemService);
                            declaredField.set(systemService, new 2Lq((Handler)ex));
                        }
                        catch (final Exception ex) {
                            6Nw.LIZ((Throwable)ex, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    return context;
                }
            }
            Label_0149: {
                if (2JT.LIZIZ || !"connectivity".equals(ex)) {
                    break Label_0149;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                }
                finally {
                    return context.getSystemService((String)ex);
                }
            }
        }
    }
    
    public static String LIZ(final ContentResolver contentResolver, final String s) {
        final 5aq 5aq = new 5aq();
        final Object[] array = { contentResolver, s };
        final 5dv 5dv = new 5dv(false);
        final 5an liz = 5aq.LIZ(102004, "android/provider/Settings$Secure", "getString", (Object)Settings$Secure.class, array, "java.lang.String", 5dv);
        if (liz.LIZ) {
            5aq.LIZ((Object)null, 102004, "android/provider/Settings$Secure", "getString", (Object)Settings$Secure.class, array, 5dv, false);
            return (String)liz.LIZIZ;
        }
        final String string = Settings$Secure.getString(contentResolver, s);
        5aq.LIZ((Object)string, 102004, "android/provider/Settings$Secure", "getString", (Object)Settings$Secure.class, array, 5dv, true);
        return string;
    }
    
    public static Set<String> LIZIZ(final Context context) {
        final ContentResolver contentResolver = context.getContentResolver();
        String lizj;
        if (TextUtils.equals((CharSequence)"enabled_notification_listeners", (CharSequence)"android_id")) {
            if (TextUtils.isEmpty((CharSequence)2bx.LIZ)) {
                2bx.LIZ = LIZ(contentResolver, "enabled_notification_listeners");
            }
            lizj = 2bx.LIZ;
        }
        else {
            lizj = LIZ(contentResolver, "enabled_notification_listeners");
        }
        final Object liziz = 06K.LIZIZ;
        monitorenter(liziz);
        Label_0142: {
            if (lizj == null) {
                break Label_0142;
            }
            try {
                if (!lizj.equals(06K.LIZJ)) {
                    final String[] split = lizj.split(":", -1);
                    final HashSet lizlll = new HashSet(split.length);
                    for (int length = split.length, i = 0; i < length; ++i) {
                        final ComponentName unflattenFromString = ComponentName.unflattenFromString(split[i]);
                        if (unflattenFromString != null) {
                            lizlll.add((Object)unflattenFromString.getPackageName());
                        }
                    }
                    06K.LIZLLL = (Set<String>)lizlll;
                    06K.LIZJ = lizj;
                }
                return 06K.LIZLLL;
            }
            finally {
                monitorexit(liziz);
            }
        }
    }
    
    public static Context LIZJ(Context applicationContext) {
        applicationContext = applicationContext.getApplicationContext();
        if (!5WL.LIZIZ) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return (Context)5WL.LIZ;
    }
    
    public final void LIZ(final int n, Notification ljff) {
        final Bundle extras = ljff.extras;
        int n2;
        if (extras != null && extras.getBoolean("android.support.useSideChannel")) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            final a a = new a(this.LJ.getPackageName(), n, ljff);
            ljff = (Notification)06K.LJFF;
            synchronized (ljff) {
                if (06K.LJI == null) {
                    06K.LJI = new c(LIZJ(this.LJ));
                }
                06K.LJI.LIZ.obtainMessage(0, (Object)a).sendToTarget();
                monitorexit(ljff);
                this.LIZ.cancel((String)null, n);
                return;
            }
        }
        this.LIZ.notify((String)null, n, ljff);
    }
    
    public final void LIZ(final String s, final int n) {
        this.LIZ.cancel(s, n);
    }
    
    public final boolean LIZ() {
        if (Build$VERSION.SDK_INT >= 24) {
            return this.LIZ.areNotificationsEnabled();
        }
        final Object liz = LIZ(this.LJ, "appops");
        final ApplicationInfo applicationInfo = this.LJ.getApplicationInfo();
        final String packageName = LIZJ(this.LJ).getPackageName();
        final int uid = applicationInfo.uid;
        try {
            final Class<?> forName = Class.forName(AppOpsManager.class.getName());
            return (int)forName.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(liz, (int)forName.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class), uid, packageName) == 0;
        }
        catch (final ClassNotFoundException | NoSuchMethodException | NoSuchFieldException | InvocationTargetException | IllegalAccessException | RuntimeException ex) {
            return true;
        }
    }
    
    public static final class b
    {
        public final ComponentName LIZ;
        public final IBinder LIZIZ;
        
        static {
            Covode.recordClassIndex(712);
        }
        
        public b(final ComponentName liz, final IBinder liziz) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
    }
    
    public static final class c implements ServiceConnection, Handler$Callback
    {
        public final Handler LIZ;
        public final Context LIZIZ;
        public final HandlerThread LIZJ;
        public final Map<ComponentName, a> LIZLLL;
        public Set<String> LJ;
        
        static {
            Covode.recordClassIndex(713);
        }
        
        public c(final Context liziz) {
            this.LIZLLL = new HashMap<ComponentName, a>();
            this.LJ = new HashSet<String>();
            this.LIZIZ = liziz;
            final HandlerThread lizj = new HandlerThread("NotificationManagerCompat");
            (this.LIZJ = lizj).start();
            this.LIZ = new Handler(lizj.getLooper(), (Handler$Callback)this);
        }
        
        private void LIZ(final a a) {
            if (a.LIZIZ) {
                this.LIZIZ.unbindService((ServiceConnection)this);
                a.LIZIZ = false;
            }
            a.LIZJ = null;
        }
        
        private void LIZIZ(final a a) {
            if (this.LIZ.hasMessages(3, (Object)a.LIZ)) {
                return;
            }
            ++a.LJ;
            if (a.LJ > 6) {
                a.LIZLLL.clear();
                return;
            }
            this.LIZ.sendMessageDelayed(this.LIZ.obtainMessage(3, (Object)a.LIZ), (long)((1 << a.LJ - 1) * 1000));
        }
        
        private void LIZJ(final a a) {
            if (a.LIZLLL.isEmpty()) {
                return;
            }
            final boolean liziz = a.LIZIZ;
            boolean liziz2 = true;
            Label_0029: {
                if (!liziz) {
                    final Intent setComponent = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(a.LIZ);
                    final Context liziz3 = this.LIZIZ;
                    if (liziz3 != null && liziz3 instanceof Context) {
                        if (!KiO.LIZ(liziz3, setComponent, (ServiceConnection)this, 33)) {
                            liziz2 = liziz3.bindService(setComponent, (ServiceConnection)this, 33);
                        }
                    }
                    else {
                        liziz2 = liziz3.bindService(setComponent, (ServiceConnection)this, 33);
                    }
                    a.LIZIZ = liziz2;
                    if (a.LIZIZ) {
                        a.LJ = 0;
                    }
                    else {
                        this.LIZIZ.unbindService((ServiceConnection)this);
                    }
                    if (!a.LIZIZ) {
                        break Label_0029;
                    }
                }
                if (a.LIZJ != null) {
                Label_0190_Outer:
                    while (true) {
                        final d d = a.LIZLLL.peek();
                        while (true) {
                            if (d == null) {
                                break Label_0190;
                            }
                            try {
                                d.LIZ(a.LIZJ);
                                a.LIZLLL.remove();
                                continue Label_0190_Outer;
                                while (true) {
                                    this.LIZIZ(a);
                                    Label_0205: {
                                        return;
                                    }
                                    iftrue(Label_0205:)(a.LIZLLL.isEmpty());
                                    continue;
                                }
                            }
                            catch (final DeadObjectException | RemoteException ex) {
                                continue;
                            }
                            break;
                        }
                    }
                }
            }
            this.LIZIZ(a);
        }
        
        public final boolean handleMessage(final Message message) {
            final int what = message.what;
            if (what == 0) {
                final Object obj = message.obj;
                final Set<String> liziz = 06K.LIZIZ(this.LIZIZ);
                if (!liziz.equals(this.LJ)) {
                    this.LJ = liziz;
                    final List queryIntentServices = this.LIZIZ.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    final HashSet set = new HashSet();
                    for (final ResolveInfo resolveInfo : queryIntentServices) {
                        if (liziz.contains(resolveInfo.serviceInfo.packageName)) {
                            final ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission != null) {
                                continue;
                            }
                            set.add(componentName);
                        }
                    }
                    for (final ComponentName componentName2 : set) {
                        if (!this.LIZLLL.containsKey(componentName2)) {
                            this.LIZLLL.put(componentName2, new a(componentName2));
                        }
                    }
                    final Iterator<Map.Entry<ComponentName, a>> iterator3 = this.LIZLLL.entrySet().iterator();
                    while (iterator3.hasNext()) {
                        final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)iterator3.next();
                        if (!set.contains(entry.getKey())) {
                            this.LIZ((a)entry.getValue());
                            iterator3.remove();
                        }
                    }
                }
                for (final a a : this.LIZLLL.values()) {
                    a.LIZLLL.add((d)obj);
                    this.LIZJ(a);
                }
                return true;
            }
            if (what == 1) {
                final b b = (b)message.obj;
                final ComponentName liz = b.LIZ;
                final IBinder liziz2 = b.LIZIZ;
                final a a2 = this.LIZLLL.get(liz);
                if (a2 != null) {
                    014 lizj;
                    if (liziz2 == null) {
                        lizj = null;
                    }
                    else {
                        final IInterface queryLocalInterface = liziz2.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        if (queryLocalInterface != null && queryLocalInterface instanceof 014) {
                            lizj = (014)queryLocalInterface;
                        }
                        else {
                            lizj = new 014.a.a(liziz2);
                        }
                    }
                    a2.LIZJ = lizj;
                    a2.LJ = 0;
                    this.LIZJ(a2);
                }
                return true;
            }
            if (what == 2) {
                final a a3 = this.LIZLLL.get(message.obj);
                if (a3 != null) {
                    this.LIZ(a3);
                }
                return true;
            }
            if (what != 3) {
                return false;
            }
            final a a4 = this.LIZLLL.get(message.obj);
            if (a4 != null) {
                this.LIZJ(a4);
            }
            return true;
        }
        
        public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
            this.LIZ.obtainMessage(1, (Object)new b(componentName, binder)).sendToTarget();
        }
        
        public final void onServiceDisconnected(final ComponentName componentName) {
            this.LIZ.obtainMessage(2, (Object)componentName).sendToTarget();
        }
        
        public static final class a
        {
            public final ComponentName LIZ;
            public boolean LIZIZ;
            public 014 LIZJ;
            public ArrayDeque<d> LIZLLL;
            public int LJ;
            
            static {
                Covode.recordClassIndex(714);
            }
            
            public a(final ComponentName liz) {
                this.LIZLLL = new ArrayDeque<d>();
                this.LJ = 0;
                this.LIZ = liz;
            }
        }
    }
    
    public interface d
    {
        default static {
            Covode.recordClassIndex(715);
        }
        
        void LIZ(final 014 p0);
    }
    
    public static final class a implements d
    {
        public final String LIZ;
        public final int LIZIZ;
        public final String LIZJ;
        public final Notification LIZLLL;
        
        static {
            Covode.recordClassIndex(711);
        }
        
        public a(final String liz, final int liziz, final Notification lizlll) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = null;
            this.LIZLLL = lizlll;
        }
        
        @Override
        public final void LIZ(final 014 014) {
            014.LIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:");
            sb.append(this.LIZ);
            sb.append(", id:");
            sb.append(this.LIZIZ);
            sb.append(", tag:");
            sb.append(this.LIZJ);
            sb.append("]");
            return sb.toString();
        }
    }
}
