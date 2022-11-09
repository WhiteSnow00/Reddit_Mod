// 
// Decompiled by Procyon v0.6.0
// 

package te;

import android.os.Parcelable;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.oss.licenses.OssLicensesActivity;
import le.b;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.oss.licenses.a;
import android.widget.AdapterView$OnItemClickListener;

public final class l implements AdapterView$OnItemClickListener
{
    public final /* synthetic */ a f;
    
    public l(final a f) {
        this.f = f;
    }
    
    public final void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        final b b = (b)adapterView.getItemAtPosition(n);
        final Intent intent = new Intent((Context)this.f.f, (Class)OssLicensesActivity.class);
        intent.putExtra("license", (Parcelable)b);
        ((Context)this.f.f).startActivity(intent);
    }
}
