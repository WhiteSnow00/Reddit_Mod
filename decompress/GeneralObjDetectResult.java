// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk.algorithm;

import com.bytedance.covode.number.Covode;

public class GeneralObjDetectResult
{
    public ObjectInfo[] obj_infos;
    public String obj_infos_data;
    public int obj_num;
    public int res;
    
    static {
        Covode.recordClassIndex(2808);
    }
    
    public GeneralObjDetectResult() {
        this.res = -1;
    }
    
    public GeneralObjDetectResult(final int obj_num, final ObjectInfo[] obj_infos) {
        this.obj_num = obj_num;
        this.obj_infos = obj_infos;
    }
    
    public GeneralObjDetectResult(final int obj_num, final ObjectInfo[] obj_infos, final String obj_infos_data) {
        this.obj_num = obj_num;
        this.obj_infos = obj_infos;
        this.obj_infos_data = obj_infos_data;
    }
    
    public void ObjectInfosData(final String obj_infos_data) {
        this.obj_infos_data = obj_infos_data;
    }
    
    public ObjectInfo[] getObjectInfos() {
        return this.obj_infos;
    }
    
    public String getObjectInfosData() {
        return this.obj_infos_data;
    }
    
    public int getObjectNum() {
        return this.obj_num;
    }
    
    public int getResult() {
        return this.res;
    }
    
    public void logData() {
        for (int i = 0; i < this.obj_num; ++i) {
            this.obj_infos[i].logData();
        }
    }
    
    public void setObjectInfos(final ObjectInfo[] obj_infos) {
        this.obj_infos = obj_infos;
    }
    
    public void setObjectNum(final int obj_num) {
        this.obj_num = obj_num;
    }
    
    public void setResult(final int res) {
        this.res = res;
    }
}
