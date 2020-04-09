# Spring-di-objects
Injection of objects (less dependency)
We are working with classes Barcelona and RealMadrid. These classes implements an interface Team:

Dependency:
	<dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-context</artifactId>
		<version>5.2.5.RELEASE</version>
	</dependency>
		
My bean configuration is such that we use references between objects:

	<bean id="myPerson" class="com.eflu.di.objects.Person">
		<property name="country" ref="myCountry"></property>
		<property name="id" value="1"></property>
		<property name="name" value="Edgar"></property>
		<property name="nickName" value="chano"></property>
		<property name="team" ref="team"></property>
	</bean>

	<bean id="myCountry" class="com.eflu.di.objects.Country">
		<property name="name" value="Peru"></property>
	</bean>

	<bean id="team" class="com.eflu.di.objects.Barcelona">
		<property name="name" value="Barcelona"></property>
	</bean>
