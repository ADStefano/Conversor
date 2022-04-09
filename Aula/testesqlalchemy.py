from sqlalchemy import create_engine

engine = create_engine('mysql://localhost:3306/',echo=True)

engine.execute("CREATE TABLE ETSET(ID PRIMARY KEY,NOME VARCHAR(45));")
