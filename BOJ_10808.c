void main()  
{  
    int abc[26];  
    char s[100];  
    int i,len,tmp;  
  
    scanf("%s",s);  
    for(i=0;i<26;i++){  
        abc[i]=0;  
    }  
    len=strlen(s);  
    for(i=0;i<len;i++)  
    {  
        tmp=s[i]-97;  
        abc[tmp]++;  
    }  
  
    for(i=0;i<26;i++)  
    {  
        printf("%d ",abc[i]);  
    }  
  
    return ;  
}  

