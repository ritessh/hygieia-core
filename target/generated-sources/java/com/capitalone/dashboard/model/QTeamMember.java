package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTeamMember is a Querydsl query type for TeamMember
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QTeamMember extends BeanPath<TeamMember> {

    private static final long serialVersionUID = -455693127L;

    public static final QTeamMember teamMember = new QTeamMember("teamMember");

    public final StringPath allocation = createString("allocation");

    public final StringPath name = createString("name");

    public final StringPath orgId = createString("orgId");

    public final StringPath regOrTemp = createString("regOrTemp");

    public final StringPath teamId = createString("teamId");

    public final ListPath<TeamLevelDetails, QTeamLevelDetails> teams = this.<TeamLevelDetails, QTeamLevelDetails>createList("teams", TeamLevelDetails.class, QTeamLevelDetails.class, PathInits.DIRECT2);

    public QTeamMember(String variable) {
        super(TeamMember.class, forVariable(variable));
    }

    public QTeamMember(Path<? extends TeamMember> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTeamMember(PathMetadata metadata) {
        super(TeamMember.class, metadata);
    }

}

