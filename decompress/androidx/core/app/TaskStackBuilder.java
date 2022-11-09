// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import n3.a;
import java.util.Iterator;
import android.os.Bundle;
import android.app.PendingIntent;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import java.util.ArrayList;
import android.content.Intent;

public final class TaskStackBuilder implements Iterable<Intent>
{
    private static final String TAG = "TaskStackBuilder";
    private final ArrayList<Intent> mIntents;
    private final Context mSourceContext;
    
    private TaskStackBuilder(final Context mSourceContext) {
        this.mIntents = new ArrayList<Intent>();
        this.mSourceContext = mSourceContext;
    }
    
    public static TaskStackBuilder create(final Context context) {
        return new TaskStackBuilder(context);
    }
    
    @Deprecated
    public static TaskStackBuilder from(final Context context) {
        return create(context);
    }
    
    public TaskStackBuilder addNextIntent(final Intent intent) {
        this.mIntents.add(intent);
        return this;
    }
    
    public TaskStackBuilder addNextIntentWithParentStack(final Intent intent) {
        ComponentName componentName;
        if ((componentName = intent.getComponent()) == null) {
            componentName = intent.resolveActivity(this.mSourceContext.getPackageManager());
        }
        if (componentName != null) {
            this.addParentStack(componentName);
        }
        this.addNextIntent(intent);
        return this;
    }
    
    public TaskStackBuilder addParentStack(final Activity activity) {
        Intent supportParentActivityIntent;
        if (activity instanceof SupportParentable) {
            supportParentActivityIntent = ((SupportParentable)activity).getSupportParentActivityIntent();
        }
        else {
            supportParentActivityIntent = null;
        }
        Intent parentActivityIntent = supportParentActivityIntent;
        if (supportParentActivityIntent == null) {
            parentActivityIntent = NavUtils.getParentActivityIntent(activity);
        }
        if (parentActivityIntent != null) {
            ComponentName componentName;
            if ((componentName = parentActivityIntent.getComponent()) == null) {
                componentName = parentActivityIntent.resolveActivity(this.mSourceContext.getPackageManager());
            }
            this.addParentStack(componentName);
            this.addNextIntent(parentActivityIntent);
        }
        return this;
    }
    
    public TaskStackBuilder addParentStack(final ComponentName componentName) {
        final int size = this.mIntents.size();
        try {
            for (Intent intent = NavUtils.getParentActivityIntent(this.mSourceContext, componentName); intent != null; intent = NavUtils.getParentActivityIntent(this.mSourceContext, intent.getComponent())) {
                this.mIntents.add(size, intent);
            }
            return this;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException((Throwable)ex);
        }
    }
    
    public TaskStackBuilder addParentStack(final Class<?> clazz) {
        return this.addParentStack(new ComponentName(this.mSourceContext, (Class)clazz));
    }
    
    public Intent editIntentAt(final int n) {
        return this.mIntents.get(n);
    }
    
    @Deprecated
    public Intent getIntent(final int n) {
        return this.editIntentAt(n);
    }
    
    public int getIntentCount() {
        return this.mIntents.size();
    }
    
    public Intent[] getIntents() {
        final int size = this.mIntents.size();
        final Intent[] array = new Intent[size];
        if (size == 0) {
            return array;
        }
        array[0] = new Intent((Intent)this.mIntents.get(0)).addFlags(268484608);
        for (int i = 1; i < size; ++i) {
            array[i] = new Intent((Intent)this.mIntents.get(i));
        }
        return array;
    }
    
    public PendingIntent getPendingIntent(final int n, final int n2) {
        return this.getPendingIntent(n, n2, null);
    }
    
    public PendingIntent getPendingIntent(final int n, final int n2, final Bundle bundle) {
        if (!this.mIntents.isEmpty()) {
            final Intent[] array = this.mIntents.toArray(new Intent[0]);
            array[0] = new Intent(array[0]).addFlags(268484608);
            return a.a(this.mSourceContext, n, array, n2, bundle);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }
    
    @Deprecated
    @Override
    public Iterator<Intent> iterator() {
        return this.mIntents.iterator();
    }
    
    public void startActivities() {
        this.startActivities(null);
    }
    
    public void startActivities(final Bundle bundle) {
        if (!this.mIntents.isEmpty()) {
            final Intent[] array = this.mIntents.toArray(new Intent[0]);
            array[0] = new Intent(array[0]).addFlags(268484608);
            if (!n3.a.startActivities(this.mSourceContext, array, bundle)) {
                final Intent intent = new Intent(array[array.length - 1]);
                intent.addFlags(268435456);
                this.mSourceContext.startActivity(intent);
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
    
    public interface SupportParentable
    {
        Intent getSupportParentActivityIntent();
    }
    
    public static final class a
    {
        public static PendingIntent a(final Context context, final int n, final Intent[] array, final int n2, final Bundle bundle) {
            return PendingIntent.getActivities(context, n, array, n2, bundle);
        }
    }
}