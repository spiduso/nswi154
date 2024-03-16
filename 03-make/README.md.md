# HW 03 - Make

Hoang Anh Tuan

hoang.dusan@gmail.com

Deadline: 17.3.2024

Requirements:

- You do not have to procotol absolutely everything, such as 'cd' commands,
  'rm -rf' when the task tells you to do a 'rm -rf', 'vim file', etc.
- Include output of commands only when explicitly requested.
- You can write answers in Czech.

Useful links and help: http://www.gnu.org/software/make/manual/

## Tasks

1. The "mydb" directory contains implementation of a very simple database.
   All source code files are in the "src" subdirectory.

2. Write all necessary Makefiles for the "mydb" project.
   Satisfy the following requirements:
	- create one Makefile at the top level (project root) and one Makefile in the 'src' subdirectory
		- for each target, the top-level Makefile should invoke the nested Makefile (in the 'src' directory) using the recommended approach
		- the nested Makefile should contain the actual rules for compiling source code files, removing generated object files, and so on
	- the full build process should create three binaries (programs): testadmin, testclient, testserver
		- each binary program should be linked against the static library libmydb.a (see below)
		- the binary programs 'testclient' and 'testadmin' will be also linked with the following libraries: libreadline, libhistory
		- you can use a command similar to the following one to perform correct linking: gcc -o testclient -L. testclient.c client_comm.c -lmydb -lreadline -lhistory
		- the binary program 'testclient' must be built from these source files: testclient.c, client_comm.c
		- the binary program 'testserver' must be built from these source files: testserver.c, server_comm.c
		- the binary program 'testadmin' must be built from these source files: testadmin.c
	- the build process should also create the static library libmydb.a 
		- the library must contain object files for all source files except those specific for the binary programs (see above)
		- use the following command to create the library file libmydb.a: ar -rcvs libmydb.a <list of object files to be included>
	- specify proper dependencies between object files, source files (.c), and binary programs
	- specify dependencies on header files (.h) only for "data.c" (by looking into the source code)
		- you do *not* have to specify dependencies on header files in the case of other source files, because there is too many of them
	- other requirements on both Makefiles
		- support the following targets
			all -> compiles everything (i.e., the full build)
			clean -> deletes all the generated files
		- define and use built-in variables for compiler and flags
			- variable CC with the value 'gcc'
			- variable CFLAGS with the value '-g -Wall'
			- set values of the variables in the top-level Makefile and tell Make to propagate the values to the Makefile in the 'src' subdirectory
		- use features supported by Make to eliminate duplication (static pattern rules, implicit rules, variables, functions), but do not over-generalize at the expense of clarity
 		- targets that do not correspond to real files should be marked appropriately

3. Test the Makefiles by executing "make" in the root directory of "mydb".
   Ignore all the warnings printed by GCC. The source code is quite old and does not follow the recent standards of C, but it should compile anyway.
   Paste the output of Make here.

- Output can be found in 2.txt file

4. Demonstrate that the dependencies work properly by invoking "make", "touch src/memory.h", "make", "touch src/testserver.c", "make". Paste the output of each command here.

- Output can be found in 3.txt file

5. Send all the Makefiles together with the protocol in a single archive.
   Do not include binaries, object files, and other temporary files generated during the build.

- Archive can be found in archive.zip file

## Survey

We use the survey to evaluate the labs (tasks) and homework assignments.
It is completely voluntary, but useful for future tuning of the content and level of complexity of the labs.
Most questions can be answered using the scale from 1 to 10.
Write your answer under the corresponding question.

(1) How new was the topic and content of the lab for you?
     (1 - brand new, 10 - I already knew everything)
- 3

(2) Do you think that the content of this lab was useful?
     (1 - useless or too trivial, 10 - very useful)
- 10

(3) How do you evaluate the level of complexity of the homework assignment?
     (1 - too trivial, 5-6 - just about right, 10 - too demanding or complex)
- 7-8

(4) How do you evaluate your prior experience with the tool in the context of the homework assignment?
     (1 - I already know and can use everything, 10 - I tried everything practically for the first time)
- 9

(5) How much time (in minutes) did you spend working on the homework assignment?
- 420

(6) Additional space for your own comments on the lab and homework assignment:
- Ad 3. Homework was a bit harder to do with only manuals and the presentation for me since I was not able to attend a class