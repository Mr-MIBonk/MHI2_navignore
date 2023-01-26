package org.dsi.ifc.androidauto;

public class AppState {
    public int appStateID;
    public int owner;

    public AppState() {
        this.appStateID = 0;
        this.owner = 0;
    }

    public AppState(int n, int n2) {
        this.appStateID = n;
        this.owner = n2;
    }

    public int getAppStateID() {
        return 0;
    }

    public int getOwner() {
        return 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append("AppState");
        stringBuffer.append('(');
        stringBuffer.append("appStateID");
        stringBuffer.append('=');
        stringBuffer.append(this.appStateID);
        stringBuffer.append(',');
        stringBuffer.append("owner");
        stringBuffer.append('=');
        stringBuffer.append(this.owner);
        stringBuffer.append(')');
        return stringBuffer.toString();
    }
}

