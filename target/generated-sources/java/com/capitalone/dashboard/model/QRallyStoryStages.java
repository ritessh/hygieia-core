package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRallyStoryStages is a Querydsl query type for RallyStoryStages
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QRallyStoryStages extends BeanPath<RallyStoryStages> {

    private static final long serialVersionUID = 1322697122L;

    public static final QRallyStoryStages rallyStoryStages = new QRallyStoryStages("rallyStoryStages");

    public final StringPath accepted = createString("accepted");

    public final StringPath backlog = createString("backlog");

    public final StringPath completed = createString("completed");

    public final StringPath defects = createString("defects");

    public final StringPath defined = createString("defined");

    public final StringPath inProgress = createString("inProgress");

    public final ListPath<UserStory, SimplePath<UserStory>> userStories = this.<UserStory, SimplePath<UserStory>>createList("userStories", UserStory.class, SimplePath.class, PathInits.DIRECT2);

    public QRallyStoryStages(String variable) {
        super(RallyStoryStages.class, forVariable(variable));
    }

    public QRallyStoryStages(Path<? extends RallyStoryStages> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRallyStoryStages(PathMetadata metadata) {
        super(RallyStoryStages.class, metadata);
    }

}

