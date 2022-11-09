// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.design.view.sheet.action;

import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialogFragment;

public class LiveActionSheetDialogFragment extends LiveBottomSheetDialogFragment
{
    static {
        Covode.recordClassIndex(6081);
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        return new LiveActionSheetDialog(this.getContext(), this.getTheme());
    }
}
