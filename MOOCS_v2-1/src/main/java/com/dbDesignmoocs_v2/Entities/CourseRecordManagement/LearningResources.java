package com.dbDesignmoocs_v2.Entities.CourseRecordManagement;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord.ResourcePersons;

@Entity
@Table(name="LearningResources")
public class LearningResources {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long resourceId;
	@Column(nullable=true)
	private String resourceType;
	@Column(nullable=true)
	private String resourceName;
	@Column(nullable=true)
	private String resourceText;
	@Column(nullable=true)
	private String resourceOther;  //path of resource
	
	@ManyToOne
	@JoinColumn(name="rukuhId")
	Rukuhaat rukuh;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "ResourcePersons")
	List<ResourceDefinition>listofResourceDefinition=new ArrayList<>();
	
	
}
