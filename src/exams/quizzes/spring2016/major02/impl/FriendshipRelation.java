package exams.quizzes.spring2016.major02.impl;

import exams.quizzes.spring2016.major02.interfaces.IEdge;
import exams.quizzes.spring2016.major02.interfaces.IVertex;


public class FriendshipRelation implements IEdge{

    
    protected FacebookUser sourceUser;
    protected FacebookUser targetUser;
    protected Date date;
    
    public FriendshipRelation(FacebookUser s, FacebookUser t){
        sourceUser=s;
        targetUser=t;
    }
    
    public FriendshipRelation(FacebookUser s, FacebookUser t, Date d){
        sourceUser=s;
        targetUser=t;
        date=d;
    }

    @Override
    public IVertex getSource() {
        return sourceUser;
    }

    @Override
    public IVertex getTarget() {
        return targetUser;
    }

    @Override
    public void setSource(IVertex v) {
        if (v instanceof FacebookUser)
        this.sourceUser=(FacebookUser)v;
    }

    @Override
    public void setTarget(IVertex v) {
        if (v instanceof FacebookUser)
        this.targetUser=(FacebookUser)v;
    }
    
}
