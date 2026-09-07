# Awesome Domain-Driven Design [![Awesome](https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/sindresorhus/awesome)

> A curated list of Domain-Driven Design (DDD), Command Query Responsibility Segregation (CQRS), Event Sourcing, and Event Storming resources.

**Check out my [blog](https://buildplease.com) and [weekly DDD newsletter](https://buildplease.com/pages/dddweekly/) or say hi on [Twitter](https://twitter.com/heynickc)!**

**[Domain-Driven Design (DDD)](https://en.m.wikipedia.org/wiki/Domain-driven_design)** is an approach to software development for complex needs by connecting the implementation to an evolving model.  The premise of Domain-Driven Design is the following:

- placing the project's primary focus on the core domain and domain logic
- basing complex designs on a model of the domain
- initiating a creative collaboration between technical and domain experts to iteratively refine a conceptual model that addresses particular domain problems

The term was coined by Eric Evans in his book of the same title.

**[Command Query Responsibility Segregation (CQRS)](http://codebetter.com/gregyoung/2010/02/16/cqrs-task-based-uis-event-sourcing-agh/)** is simply the creation of two objects where there was previously only one. The separation occurs based upon whether the methods are a command or a query (the same definition that is used by Meyer in Command and Query Separation, a command is any method that mutates state and a query is any method that returns a value).

**[Event Sourcing](http://www.martinfowler.com/eaaDev/EventSourcing.html)** the fundamental idea of Event Sourcing is that of ensuring every change to the state of an application is captured in an event object, and that these event objects are themselves stored in the sequence they were applied for the same lifetime as the application state itself.

**[Event Storming](https://ziobrando.blogspot.com/2013/11/introducing-event-storming.html)** is a workshop format for quickly exploring complex business domains.

## Contents

- [Awesome Domain-Driven Design](https://github.com/heynickc/awesome-ddd/)
        - [Contents](#contents)
        - [Books](#books)
        - [Free eBooks](#free-ebooks)
        - [Training Courses](#training-courses)
        - [Video Collections](#video-collections)
        - [Community Resources](#community-resources)
        - [Blogs](#blogs)
        - [Sample Projects](#sample-projects)
                - [GO](#go)
                - [.NET (C#/F#)](#net-cf)
                - [Haskell](#haskell)
                - [Idris](#idris)
                - [JavaScript / TypeScript](#javascript--typescript)
                - [JVM languages](#jvm-languages)
                - [PHP](#php)
        - [Libraries and Frameworks](#libraries-and-frameworks)
                - [GO](#go-1)
                - [.NET](#net)
                - [Databases](#databases)
                - [Elixir](#elixir)
                - [JavaScript / TypeScript](#javascript--typescript-1)
                - [JVM](#jvm)
                - [PHP](#php-1)
                - [Python](#python)
                - [Ruby](#ruby)
        - [Podcasts and Interviews](#podcasts-and-interviews)
        - [Conferences](#conferences)
        - [User Groups](#user-groups)
        - [Tools](#tools)
        - [License](#license)

## Books

- [Applying Domain Driven Design with CQRS and Event Sourcing](https://buildplease.com/pages/now-what/) - A walkthrough of using EventStorming and other modeling techniques to build a CQRS and Event Sourcing-based prototype for a fictional business domain.
- [Architecture Modernization](https://www.manning.com/books/architecture-modernization) - Concrete tools, techniques, and processes to align software architecture with your business domains, organizational design, team topologies, and corporate strategy.
- [Collaborative Software Design](https://www.manning.com/books/collaborative-software-design) - A practical guide for effectively involving all stakeholders in the design of software.A practical guide for effectively involving all stakeholders in the design of software.
- [CQRS](https://leanpub.com/cqrs) - Notes by Mark Nijhof from his experiences learning DDD and CQRS from Greg Young.  There is an extensive sample project that accompanies this book.
- [Crafting Great APIs with Domain-Driven Design: Collaborative Craftsmanship of Asynchronous and Synchronous APIs](https://amzn.to/4oN6fqk) - A comprehensive guide to designing and building APIs using Domain-Driven Design principles, covering both event-driven asynchronous and synchronous API patterns.
- [Domain-Driven Design: Tackling the Complexity at the Heart of Software](https://amzn.com/0321125215) - The canonical book that coined the term Domain-Driven Design.  Also known as the "Blue Book."
- [Domain-Driven Design Distilled](https://www.amazon.com/Domain-Driven-Design-Distilled-Vaughn-Vernon/dp/0134434420) - Very good starter book before you read [Implementing Domain-Driven Design](https://vaughnvernon.co/?page_id=168#iddd) or [Domain-Driven Design: Tackling the Complexity at the Heart of Software](https://amzn.com/0321125215).
- [Domain-Driven Design in PHP](https://leanpub.com/ddd-in-php) - Real examples written in PHP showcasing DDD Architectural Styles, Tactical Design, and Bounded Context Integration.
- [Domain-Driven Rails](https://blog.arkency.com/domain-driven-rails/) - Domain-Driven Rails describes 11 techniques (from Bounded Contexts to Event Sourcing) that you can use separately and together in new and old Rails apps to achieve better architecture.
- [Domain Modeling Made Functional](https://pragprog.com/book/swdddf/domain-modeling-made-functional) - Tackle Software Complexity with Domain-Driven Design and F#.
- [Domain Specific Languages](http://martinfowler.com/books/dsl.html) - Tangentially connected to DDD, describes the importance of the Ubiquitous Language and working together with domain experts, along with lots of technical details.
- [Event Sourcing and CQRS with .NET Core and SQL Server](https://buildplease.com/products/fpc-v2/) - A walkthrough of using Domain-Driven Design with Event Sourcing and CQRS using ASP.NET Core and SQL Server in production.
- [Hands-On Domain-Driven Design with .NET Core](https://www.amazon.com/Hands-Domain-Driven-Design-NET-dp-1788834097/dp/1788834097) - Tackling complexity in the heart of software by putting DDD principles into practice by Alexey Zimarev.
- [Implementing Domain-Driven Design](https://www.amazon.com/Implementing-Domain-Driven-Design-Vaughn-Vernon/dp/0321834577) - Also a canonical book presenting a top-down approach to understanding Domain-Driven Design.  Also known as the "Red Book."
- [Implementing DDD, CQRS and Event Sourcing](https://leanpub.com/implementing-ddd-cqrs-and-event-sourcing) - Learn how to implement DDD, CQRS and Event Sourcing. Understand the theory and put it into practice with JavaScript and Node.js.
- [Introducing Event Storming: An act of Deliberate Collective Learning](https://leanpub.com/introducing_eventstorming) - The deepest tutorial and explanation about EventStorming, straight from the inventor.
- [Learning Domain-Driven Design: Aligning Software Architecture and Business Strategy](https://www.amazon.com/Learning-Domain-Driven-Design-Aligning-Architecture/dp/1098100131/) - Learn the essential patterns and practices of domain-driven design and how to apply them in your day-to-day work, both in greenfield and brownfield projects.
- [Microsoft .NET - Architecting Applications for the Enterprise (2nd Edition)](https://www.amazon.com/Microsoft-NET-Architecting-Applications-Enterprise/dp/0735685355/) - A software architect’s digest of core practices, pragmatically applied.
- [Patterns, Principles, and Practices of Domain-Driven Design (1st Edition)](https://www.amazon.com/Patterns-Principles-Practices-Domain-Driven-Design/dp/1118714709) - Methods for managing complex software construction following the practices, principles and patterns of Domain-Driven Design with code examples in C#.
- [Secure by Design](https://www.manning.com/books/secure-by-design?a_aid=danbjson&a_bid=0b3fac80) - Shows how to use Domain-Driven Design to avoid security vulnerabilities.
- [Specification by Example](https://www.manning.com/books/specification-by-example) - This book distills from the experience of leading teams worldwide effective ways to specify, test, and deliver software in short, iterative delivery cycles. Case studies in this book range from small web startups to large financial institutions, working in many processes including XP, Scrum, and Kanban.
- [Versioning in an Event Sourced System](https://leanpub.com/esversioning) - Have you had troubles with versioning an Event Sourced system? Just getting into a new Event Sourced system for the first time? This book is the definitive guide of how to handle versioning over long periods of time.
- [What is Domain-Driven Design?](https://learning.oreilly.com/library/view/what-is-domain-driven/9781492057802/) - A quick read exploring the core patterns and principles of Domain-Driven Design, as well as strategies for applying DDD in brownfield projects.
- [Writing Great Specifications](https://www.manning.com/books/writing-great-specifications) - Writing Great Specifications is an example-rich tutorial that teaches you how to write good Gherkin specification documents that take advantage of Specification by Example's benefits.
- 

## Free eBooks

- [The Anatomy of Domain-Driven Design - The Infographic](https://leanpub.com/theanatomyofdomain-drivendesign) - An infographic on the anatomy of Domain-Driven Design.
- [Architecting Modern Web Applications with ASP.NET Core and Microsoft Azure](https://dotnet.microsoft.com/download/thank-you/aspnet-ebook) - Provides end-to-end guidance on building monolithic web applications using DDD, ASP.NET Core, and Azure. [eShopOnWeb sample](https://github.com/dotnet-architecture/eShopOnWeb)
- [Architecture Patterns with Python](https://www.cosmicpython.com/book/preface.html) - A book about Pythonic application architecture patterns for managing complexity.
- [CQRS Journey](https://msdn.microsoft.com/en-us/library/jj554200.aspx) - Exploring CQRS and Event Sourcing.
- [Domain-Driven Design: The First 15 Years](https://dddeurope.com/15years) - To celebrate the anniversary, we've asked prominent authors in the software design world to contribute old and new essays. With contributions by Martin Fowler, James Coplien, Rebecca Wirfs-Brock, Mel Conway, and many more.
- [DDD Reference](http://domainlanguage.com/wp-content/uploads/2016/05/DDD_Reference_2015-03.pdf) - A summary of the patterns and definitions of DDD.
- [Domain Driven Design Quickly](https://www.infoq.com/minibooks/domain-driven-design-quickly) - Domain Driven Design Quickly is a short, quick-readable summary and introduction to the fundamentals of DDD.
- [Effective Aggregate Design](http://dddcommunity.org/library/vernon_2011/) -  In this three-part series, Vaughn Vernon walks through some common design pitfalls, discusses the pros and cons of various aggregate modeling choices, and provides rules of thumb to guide modeling of aggregates.
- [Getting Started with DDD when Surrounded by Legacy Systems](http://domainlanguage.com/wp-content/uploads/2016/04/GettingStartedWithDDDWhenSurroundedByLegacySystemsV1.pdf) - Describes three strategies for getting started with DDD when you have a big commitment to legacy systems.
- [Living Documentation by Design, with Domain-Driven Design](https://leanpub.com/livingdocumentation) - Discover how a Living Documentation can help you in all aspects of your projects, from the business goals to the business domain knowledge, architecture and design, processes and deployment, even if you hate writing documentation.
- [.NET Microservices: Architecture for Containerized .NET Applications](https://dotnet.microsoft.com/download/thank-you/microservices-architecture-ebook) - An introduction to developing microservices-based applications and managing them using containers. [eShopOnContainers sample](https://github.com/dotnet-architecture/eShopOnContainers)
- [The Semantic JavaScript Backend for Event-Driven Development](https://docs.wolkenkit.io/1.1.0/downloads/brochure/) - A 68 pages long free ebook on what DDD, CQRS and event-sourcing are, and how they fit each other.
- [DDD Magazine from Xebia #1](https://pages.xebia.com/domain-driven-design-magazine-xebia) - This magazine is packed with visionary and practical insights, based on personal, business, and customer experiences to support you on your DDD journey
- [Visual Collaboration Tools](https://leanpub.com/visualcollaborationtools/) - Visual Collaboration Tools is a book for teams building software. It describes tools that help us in our daily job, and also present field stories from different practitioners.

## Training Courses
- [Advanced Distributed Systems Design](https://learn-particular.thinkific.com/courses/adsd-online) - Online training course from Udi Dahan.  Udi's live training schedule can be found [here](http://udidahan.com/training/).
- [DDD Workshops across Europe and Online](https://training.dddeurope.com/) - Public Workshops by Eric Evans, Alberto Brandolini, Mathias Verraes, Rebecca Wirfs-Brock, Nick Tune, and many more.
- [DDD Workshop by Xebia](https://xebia.com/academy/en/search?query=Domain-driven%20design) - public and in-house Domain-driven design workshops from foundation to professional level.
- [Distilling Domain-Driven Design](https://www.informit.com/store/domain-driven-design-livelessons-video-training-9780134597324) - Vaughn Vernon's online training course.
- [Domain Language eLearning](http://elearn.domainlanguage.com/) - Using our video lessons with Eric Evans, author of the original book on Domain-Driven Design (DDD), teach yourself techniques for evolving practical models that improve your software — not just your documents.
- [Event Sourcery](https://www.youtube.com/@EventSourcery) - Introduction to DDD, CQRS, and Event Sourcing.
- [EventStorming Fundamentals Course](https://elearning.dsolemorera.com/courses/eventstorming-fundamentals) ([also in Spanish](https://elearning.dsolemorera.com/courses/fundamentos-eventstorming)) - learn the fundamentals of EventStorming. Everything about EventStorming with examples.
- [Greg Young's CQRS Class](http://subscriptions.viddler.com/GregYoung/) - These videos include the entirety of Greg Young's DDD, CQRS, and Event Sourcing class.
- [Mixter](https://github.com/DevLyon/mixter) - CQRS and Event Sourcing Koans.
- [Nomad PHP](https://nomadphp.com/product/introduction-event-sourcing-cqrs/) - Introduction to Event Sourcing and CQRS.
- [Pluralsight](https://pluralsight.com)
         - [Domain-Driven Design Fundamentals](https://www.pluralsight.com/courses/domain-driven-design-fundamentals) - Teaches the fundamentals of Domain-Driven Design (DDD) through a demonstration of customer interactions and a complex demo application, along with advice from Eric Evans.
         - [Domain-Driven Design in Practice](https://www.pluralsight.com/courses/domain-driven-design-in-practice) - A descriptive, in-depth walk-through for applying Domain-Driven Design principles in practice.
         - [Modern Software Architecture: Domain Models, CQRS, and Event Sourcing](https://www.pluralsight.com/courses/modern-software-architecture-domain-models-cqrs-event-sourcing) - This course covers DDD analysis patterns helpful in discovering the top-level architecture of a business domain. Architects and developers will find details of implementation patterns such as Domain Model, CQRS, and Event Sourcing.
- [Rails + Domain Driven Design Workshop](https://blog.arkency.com/ddd-training/) - Introduction to DDD, fundamentals of CQRS & Event Sourcing for Ruby/Rails developers.
- [Reactive Architecture: CQRS and Event Sourcing](https://cognitiveclass.ai/courses/reactive-architecture-cqrs/) - This course will discuss the reasons we use CQRS/ES, what benefits it provides us, but also what it will cost us to use. We will see how CQRS/ES can impact the scalability, consistency, and availability of our application.
- [Reactive Architecture: Domain Driven Design](https://cognitiveclass.ai/courses/reactive-architecture-ddd/) - Use DDD to decompose a problem domain into manageable parts. Learn how those parts can become the foundation of Reactive Microservices and Reactive Architecture. Free, online, self-paced. Certificate offered upon completion.
- [Spatie's Event Sourcing Course](https://spatie.be/products/event-sourcing-in-laravel) - Learn how to build event sourced applications in Laravel using Spatie's event-sourcing package. Has 2 hours of video content and an accompanying ebook.

## Video Collections

- [DDD Europe](https://dddeurope.com/videos) - Recordings of talks given at DDD Europe.
- [SkillsCasts by SkillsMatter](https://skillsmatter.com/skillscasts) - Searching DDD returns various talks given by Greg Young, Alberto Brandolini, and Dan North, etc.
- [Alberto Brandolini: Event Storming](https://www.youtube.com/watch?v=veTVAN0oEkQ&list=PLve553MhJLs4YkEnHmOjWJv0B-6WY0-JI) - A YouTube collection of talks given by Alberto Brandolini on Event Storming.
- [GlobalAppTesting TechTalks](https://drive.google.com/drive/folders/1D4LPXUnT9_r8j4Qd1t0qsJLXHh95DPMJ?usp=share_link) - Library of public tech talks focused on DDD and CQRS.
- [Greg Young](https://www.youtube.com/watch?v=JHGkaShoyNs&list=PL5XpN_ZVafKLePdxruDfdfi-IiZtXz-k9) - A YouTube collection of various talks given by Greg Young.
- [Explore DDD videos](https://www.youtube.com/channel/UCcpKGt6MVvz7dISXLlMGmag) - Recordings of the talks given at the Explore DDD conference.
- [KanDDDinsky](https://www.youtube.com/channel/UCJCpnslPdb_Dl8DKokXC3HA) - A YouTube collection of talks given at KanDDDinsky.
- [Virtual Domain-driven design](https://www.youtube.com/channel/UCob_jOzzpxBp-di-x0vLlwA) - A youtube collection of recorded meetups session from Virtual Domain-driven design
- [Visuality DDD webinars](https://youtube.com/playlist?list=PLvMNoWK93wtnu9JcSEYnFRgzqbxtLtZZ4) - A YouTube collection of webinars focused on DDD in Ruby on Rails
- [The Art of Discovering Bounded Contexts by Nick Tune](https://www.youtube.com/watch?v=ez9GWESKG4I) - Session from 2017 DevoxxUK on how to define bounded contexts

## Community Resources

- [DDD/CQRS Google Group](https://groups.google.com/forum/?utm_source=digest&utm_medium=email#!forum/dddcqrs) - An active mailing list and an excellent resource to ask questions and learn fine-grained details about DDD/CQRS.
- [DDD-es Google Group](https://groups.google.com/g/ddd-es) - The Google Group to discuss Domain-Driven Design in Spanish.
- [DDDinPHP Google Group](https://groups.google.com/forum/#!forum/dddinphp) - The place to discuss Domain-Driven Design, CQRS, Event Sourcing, Model Storming, Hexagonal Architecture, Distributed Systems, Reactive... in the context of PHP.
- [EventStorming Google Group](https://groups.google.com/g/eventstorming) - The Google Group to discuss EventStorming.
- [DDD in Ruby on Rails](https://www.visuality.pl/posts/introduction-to-ddd-in-ruby-on-rails) - A collection of articles on Domain-Driven Design in Ruby on Rails
- [DDD in Ruby subreddit](https://www.reddit.com/r/ddd_ruby/) - A subreddit for Ruby developers interested in Domain-Driven Design.
- [DDD/CQRS/ES Discord](https://github.com/ddd-cqrs-es/community) - A Discord (old Slack) team for those who want to chat about Domain-Driven Design, CQRS, Event Sourcing and sometimes random things. Main channel is language and framework agnostic.
- [Domain StoryTelling Discord](https://discord.gg/KsYaHNNn33) - A Discord team about Domain StoryTelling (#domain-storytelling channel) by [@hofstef](https://twitter.com/hofstef). The homepage is at [domainstorytelling.org](http://domainstorytelling.org/).
- [Software Engineering Stack Exchange](http://softwareengineering.
