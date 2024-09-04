class Solution {
     public static char dir(char direc,int x){
       
           
            if(direc=='n'){
            if(x==-1){
                return 'e';
            }
             if(x==-2){
                return 'w';
            }

        }
        if(direc=='e'){
            if(x==-1){
                return 's';
            }
             if(x==-2){
                return 'n';
            }

        }
        if(direc=='s'){
            if(x==-1){
                return 'w';
            }
             if(x==-2){
                return 'e';
            }

        }
        if(direc=='w'){
            if(x==-1){
                return 'n';
            }
             if(x==-2){
                return 's';
            }

        }
        return 'r';
    }
    public static boolean check(int x,int y,int[][] obs){
        for(int i=0;i<obs.length;i++){
            
                if(obs[i][0]==x&&obs[i][1]==y){
                    return false;
                }
           
        }
        return true;
    }

    public static void cal(int command,int[] curr,int[][] obstacles,char[] ch ,int[] ans){
        
        char direction;
        int max=0;
        if(command<=0){
            direction=dir(ch[0],command);
            ch[0]=direction;
            return;
        }else{
            direction=ch[0];

        if(direction=='n'){
            

            for(int i=1;i<=command;i++){
                if(check(curr[0],curr[1]+1,obstacles)){
                    curr[1]=curr[1]+1;
                }else{
                    max=curr[0]*curr[0]+curr[1]*curr[1];
                    ans[0]=ans[0]<max?max:ans[0];
                    return;
                }
            }
            max=curr[0]*curr[0]+curr[1]*curr[1];
            ans[0]=ans[0]<max?max:ans[0];
            return;
           
        }else
        if(direction=='e'){
             for(int i=1;i<=command;i++){
                if(check(curr[0]+1,curr[1],obstacles)){
                    curr[0]=curr[0]+1;
                }else{
                    max=curr[0]*curr[0]+curr[1]*curr[1];
                    ans[0]=ans[0]<max?max:ans[0];
                    return;
                }
            }
            max=curr[0]*curr[0]+curr[1]*curr[1];
            ans[0]=ans[0]<max?max:ans[0];
            return;

        }else
        if(direction=='s'){
             for(int i=1;i<=command;i++){
                if(check(curr[0],curr[1]-1,obstacles)){
                    curr[1]=curr[1]-1;
                }else{
                    max=curr[0]*curr[0]+curr[1]*curr[1];
                    ans[0]=ans[0]<max?max:ans[0];
                    return;
                }
            }
            max=curr[0]*curr[0]+curr[1]*curr[1];
            ans[0]=ans[0]<max?max:ans[0];
            return;
           
        }else
        if(direction=='w'){
             for(int i=1;i<=command;i++){
                if(check(curr[0]-1,curr[1],obstacles)){
                    curr[0]=curr[0]-1;
                }else{
                    max=curr[0]*curr[0]+curr[1]*curr[1];
                    ans[0]=ans[0]<max?max:ans[0];
                    return;
                }
            }
            max=curr[0]*curr[0]+curr[1]*curr[1];
                    ans[0]=ans[0]<max?max:ans[0];
                    return;
          
        }

        }
        

    }
    public static int robotSim(int[] commands, int[][] obstacles) {
        int[] curr=new int[2];
        curr[0]=0;
        curr[1]=0;
        int[] ans=new int[1];
        ans[0]=0;
        char[] ch=new char[1];
        ch[0]='n';
        
        for(int i=0;i<commands.length;i++){
            cal(commands[i],curr,obstacles,ch,ans);
        }
        int res=ans[0];

        return res;

        
    }
}
