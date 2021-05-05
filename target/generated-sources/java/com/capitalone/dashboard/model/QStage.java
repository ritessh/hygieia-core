package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStage is a Querydsl query type for Stage
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QStage extends BeanPath<Stage> {

    private static final long serialVersionUID = 1435598940L;

    public static final QStage stage = new QStage("stage");

    public final SetPath<PipelineCommit, SimplePath<PipelineCommit>> commits = this.<PipelineCommit, SimplePath<PipelineCommit>>createSet("commits", PipelineCommit.class, SimplePath.class, PathInits.DIRECT2);

    public QStage(String variable) {
        super(Stage.class, forVariable(variable));
    }

    public QStage(Path<? extends Stage> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStage(PathMetadata metadata) {
        super(Stage.class, metadata);
    }

}

